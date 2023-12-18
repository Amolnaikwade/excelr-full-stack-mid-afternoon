class AB
{
	public static void main(String[] args) 
	{
		int n=5;

		for(int i=1; i<=n; i++)
		{
			
			for( int j=n;j>=1; j++)
			{
				if(i>=j)
				System.out.print(j);
				else
				System.out.print(" ");
				
			}
			System.out.println();
		}
		

	}
}
/*

    1
   22
  333
 4444
55555
*/
