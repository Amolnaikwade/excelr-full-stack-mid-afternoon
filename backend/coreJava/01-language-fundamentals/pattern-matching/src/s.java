class s
{
	public static void main(String[] args) 
	{
		char c= 'A';
		for(int i=5; i>=1; i--)
		{
			
			for( int j=1;j<=i; j++)
			{
				
				System.out.print(c);
			c++;	
				
			}
			c='A';
			System.out.println();
		}
		
	}
}
/*
ABCDE
ABCD
ABC
AB
A
*/