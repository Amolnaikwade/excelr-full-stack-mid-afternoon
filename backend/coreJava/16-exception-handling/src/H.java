class G 
{
	static void test()
	{
		System.out.println("test begin");
		int i = 10/0;
		System.out.println("test end");
	}
}
class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		G.test();
		System.out.println("main end");

	}
}
/*
main begin
test begin
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at G.test(h.java:6)
        at H.main(h.java:15)
		*/