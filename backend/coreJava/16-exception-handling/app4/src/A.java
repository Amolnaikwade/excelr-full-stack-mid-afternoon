class A 
{
	int test()

	{
		try
		{
			return 10;
		}
		catch (ArithmeticException ex)
		{
			return 20;
		}
		return 30;
	}
}
/*
A.java:14: error: unreachable statement
                return 30;
                ^
1 error
*/
