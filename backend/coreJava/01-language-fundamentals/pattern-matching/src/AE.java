class AE
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
			
			for(int k = 1; k<= i ; k++)
			{
				char ch = (char)('A' +k - 1);
			System.out.print(ch);
			}
				System.out.println();
		}
	

	}
}
/*

					A

                  A B

                A B C

              A B C D 

            A B C D E
			*/