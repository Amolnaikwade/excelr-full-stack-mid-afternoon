class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10/0;
		System.out.println("main end");
	}
}
/*
main begin
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at A.main(A.java:6)


-an excption is an abnormal condition. that distrupt normal flow of program execution.
- in java we have exception handling machanism unlike C.
-in java we can able to handle exception by using try & catch block.

advantage of exceptioj handling
we can maintain normal flow of application.
two types of exceptions

1.checked Exceptions
2.Unchecked Exception

*/