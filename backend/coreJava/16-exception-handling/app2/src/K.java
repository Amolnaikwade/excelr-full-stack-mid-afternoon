class K
{
	public static void main(String[] args) 
	{
		int i = 10 / 0;
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
		System.out.println("main end");
	}
}
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at K.main(K.java:5)
		*/