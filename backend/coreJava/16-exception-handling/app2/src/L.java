class L
{
	public static void main(String[] args) 
	{
		
		System.out.println("main begin");
		try
		{
			System.out.println("from try");
			
		}
		catch (NumberFormatException ex)
		{
			System.out.println("from catch: " + ex);
		}
		
		finally
		{
			System.out.println("from finally");
		}
		int i = 10 / 0;
		System.out.println("main end");
	}
}
/*
main begin
from try
from finally
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at L.main(l.java:21)

		*/