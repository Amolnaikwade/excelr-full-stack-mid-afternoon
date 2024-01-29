class  A
{
	public static void main(String[] args) 
	{
		// local variables can't be static
		static int i = 10;

		System.out.println(i);
	}
}
/*
 error: illegal start of expression
                static int i = 10;
                ^
1 error
*/