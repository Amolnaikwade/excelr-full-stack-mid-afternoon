class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		try
		{
			System.out.println("from try begin");
			i = 10/0;
			System.out.println("from try end");
		}
		finally 
		{
			System.out.println("from finlly");
		}
		System.out.println("main end");
	}
}
/*
main begin
from try begin
from finlly
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at A.main(a.java:10)
		try-catch
		try-catches
		try-catch-finally
		try-catches-finally
		try-finally


		


		class A
		{
			public static void main(String[] args)
			{
				System.out.println("main start");
				try
				{
					System.out.println("try start");
					int i = i /10;
					System.out.println("try end");
					
				}
				finally
				{
					System.out.println("from finally");

				}
				System.out.println("main ens");

			}
			}
			*/