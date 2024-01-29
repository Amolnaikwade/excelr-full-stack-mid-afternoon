class J 
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
		catch(NullPointerException ex)
		{
			return 30;
		}
		finally
		{
		}
		System.out.println("end of main");
	}
	}
/*
unreachable statement
return 30;



class j
{
	int test()
	{
		try
	}
}
*/