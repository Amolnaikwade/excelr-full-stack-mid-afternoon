class X 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		int i;
		try
		{
			
			System.out.println("from try begin");
			i = 10 / 0;
			System.out.println("from try end");
		}
		catch (ArithmeticException ex)
		{
			ex = null;
		}
		System.out.println("main end: " + ex);
	}
}
/*
-Loal variable of try /catch / finally cant be used outside , if you want use variable in all these block then declare 
x.java:18: error: cannot find symbol
                System.out.println("main end: " + ex);
                                                  ^
  symbol:   variable ex
  location: class X
1 error
*/