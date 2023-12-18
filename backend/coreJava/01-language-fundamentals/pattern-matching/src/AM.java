class AM
{
	public static void main(String[] args) 
	{
		int n=10;

		for(int i=1; i<=n; i++)
		{
			
			for( int j= n;j>=i; j--)
			{
					System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
				if(i%2 !=0)
		System.out.print(i +" ");
			System.out.println();
		
		
		}
	}
}
/*
					1

				  3 3 3

				5 5 5 5 5

			  7 7 7 7 7 7 7

			9 9 9 9 9 9 9 9 9

*/