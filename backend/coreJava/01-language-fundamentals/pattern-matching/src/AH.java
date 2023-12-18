class AH
{
	public static void main(String[] args) 
	{
		int n=5;

		for(int i=1; i<=n; i++)
		{
		
			for( int j=1;j<i; j++)
			{
				
				System.out.print(" ");
				
			}
				char ch = (char)('E' -i +1);
			for(int k = i; k<= n ; k++)
			{
			
			System.out.print(ch);
			}
				System.out.println();
		}
	

	}
}
/*
EEEEE
 DDDD
  CCC
   BB
    A
	*/