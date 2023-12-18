class AJ
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
				
			for(int k = 1; k<= n-i+1 ; k++)
			{
			char ch = (char)('a' +k -1);
			System.out.print(ch);
			}
				System.out.println();
		}
	

	}
}
/*
abcde
 abcd
  abc
   ab
    a
	*/