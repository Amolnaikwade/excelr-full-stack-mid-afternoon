class AD
{
	public static void main(String[] args) 
	{
		int n=5;

		for(int i=1; i<=n; i++)
		{
		
			for( int j=1;j<=n-i; j++)
			{
				
				System.out.print(" ");
				
			}
			char ch = (char)('A' +i - 1);
			for(int k = 1; k<= i ; k++)
			{
			System.out.print(ch);
			}
				System.out.println();
		}
	

	}
}
/*
					A

                  B B

                C C C

              D D D D 

            E E E E E
			
			*/