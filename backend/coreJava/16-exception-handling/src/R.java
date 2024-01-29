class R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin ");
		try
		
			{
				System.out.println("try begin");
				int i = 10 / 0;
				System.out.println("try end");

		}
		catch (NullPointerException ex)
		{
			System.out.println("from catch");

		}
		System.out.println("main end");
	}
}
/*
main begin
try begin
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at R.main(r.java:10)
*/