import java.util.Scanner;
class W
{
 	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("enter one int value");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		try
		{
			System.out.println("from try begin");
			i = 10 / 0;
			System.out.println("from try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch begin");
			i = 10 / 0;
			System.out.println("from catch end");	
		}
		finally
		{
			//best practice, to close the opened resource
			sc.close();
			System.out.println("from finally");	
		}
		System.out.println("main end");
	}
}
/*
main begin
enter one int value
3
from try begin
from catch begin
from finally
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at W.main(w.java:19)



-TO close some resourse to prevent data curruption and data inconsistancy we have to close some resourses, those statements we can keep inside finally block to execute some mandtory statemnt regarless of the exception and handling status, we can use finally block.