class Z 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			throw new ArithmeticException();
		
		}
		System.out.println("main end");
	}
}
/*
by using throwkeyword we can only raised the exception.
main begin
Exception in thread "main" java.lang.ArithmeticException
        at Z.main(Z.java:8)
-we can rise th execption by orividing some messsage, we need to 
*/