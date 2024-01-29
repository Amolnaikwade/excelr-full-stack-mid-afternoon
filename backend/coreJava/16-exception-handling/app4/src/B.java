class B
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
		catch (NullPointerException ex)
		{
			return 30;
		}
		
	}
}
/*
class C
{
	int test()
	{
		try
		{
			return 10;

}
catch(Aritmetic ex)
{
	return 20;

}
catch(Aritmetic ex)
{
	return 30;
}
	}

}

*/