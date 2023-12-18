class AO
{
	public static void main(String[] args) 
	{
		int n=4;

		for(int i=0; i<n; i++)
		{
		
			for( int j=0;j<2*(n-i)-2; j++)
			{
				
				System.out.print(" ");
				
			}
				char ch = (char)('A' +2 * i);
			for(int k = 0; k< 2*i+1 ; k++)
			{
			
			System.out.print(ch +" ");
			}
				System.out.println();
		}
	
			for(int i=0; i<14; i++)
		{
			System.out.print("| ");
		}
	}
}
/*
      A
    C C C
  E E E E E
G G G G G G G
| | | | | | | | | | | | | |
	*/