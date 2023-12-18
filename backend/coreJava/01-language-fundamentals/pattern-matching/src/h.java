class h
{
	public static void main(String[] args) 
	{
		for(char c='E'; c>='A'; c--)
		{
			System.out.print(c+" ");
			for(int j=0; j<5; j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}

	}
}
/*
E EEEEE
D DDDDD
C CCCCC
B BBBBB
A AAAAA
*/