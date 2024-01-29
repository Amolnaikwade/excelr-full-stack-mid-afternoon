class P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("from try begin");
			int i = 10 / 0;
			System.out.println("from try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch: " + ex);
			System.exit(10);
		}
		finally
		{
			System.out.println("from finally");	
		}
		System.out.println("main end");
	}
}
/*
System.exit(10);
avoid the finally 

main begin
from try begin
from catch: java.lang.ArithmeticException: / by zero

*/