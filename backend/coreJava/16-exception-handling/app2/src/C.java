class C 
{
	public static void main(String[] args) 
	{
		System.out.println("mian begin");
		try
		{
			System.out.println("try begin");
			try{
				int i = 10 / 0;
			}
			catch(ArithmeticException ex1)
			{
				System.out.println("from nested try-catch: " + ex1);
			}
			System.out.println("try end");
		}
		catch (ArithmeticException ex1)
		{
			System.out.println("from outer try-catch" + ex1);
		}
		System.out.println("main end");
	}
}
/*
mian begin
try begin
from nested try-catch: java.lang.ArithmeticException: / by zero
try end
main end
*/