class K 
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
			System.out.println("from catch: " + ex.getMessage());
		}
		System.out.println("main end");
	}
}
/*
main begin
from catch: / by zero
main end




class K
{
	public static void main(String[] args)
	{
		System.out.println("main start");
		try
		{
			int i= 10/0;
		}
		catch (ArithmeticException ex)
		{
			System.out.pintln("from catch" + ex.getMessage());
		}
	}
}
*?/