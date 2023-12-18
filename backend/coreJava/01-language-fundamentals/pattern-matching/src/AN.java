class AN
{
	public static void main(String[] args) 
	{
		int n=5;

		for(int i=0; i<n; i++)
		{
		
			for( int j=0;j<n-i-1; j++)
			{
				
				System.out.print(" ");
				
			}
				char ch = (char)('A' + i);
			for(int k = 0; k< 2*i+1 ; k++)
			{
			
			System.out.print(" "+ch);
			}
				System.out.println();
		}
	

	}
}
/*
      A
    B B B
   C C C C C
  D D D D D D D
 E E E E E E E E E
	*/