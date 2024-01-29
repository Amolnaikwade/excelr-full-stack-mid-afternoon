class P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			int i = 10 / 0;
		}
		catch (ArithmeticException ex)
		{
		}
		System.out.println("main end");
	}
}
/*
-try-catch can be kept anywhere.

-using tyr catch blocks we can handle the raised exception object.
- Whatever the exception causing statement are there we would should keep them inside the try block and accordimg to the raised exception object ewe need to develop the catch block.
Ex.
		try
		{
			int i = 10 / 0;
		}
		catch (ArithmeticException ex)
		{
		}
*/