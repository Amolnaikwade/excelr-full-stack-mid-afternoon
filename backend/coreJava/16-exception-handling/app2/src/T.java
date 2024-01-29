class T
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		try
		{
			System.out.println("from try begin");
			i = 10 / 0;
			System.out.println("from try end");
		}
		catch (ArithmeticException ex)
		{
			ex.printStackTrace(System.err);//every detail information about exception
			System.out.println("from catch: " + (i = 20));
		}
		finally
		{
			System.out.println("from finally: " + (i = 40));
		}
		System.out.println("main end: " + i);
	}
}
/*
-printstackTrace- every detail information about exception
-system.err stsndard error stream. - to print error to the out screen. its optional.

main begin
from try begin
java.lang.ArithmeticException: / by zero
        at T.main(t.java:10)
from catch: 20
from finally: 40
main end: 40
*/