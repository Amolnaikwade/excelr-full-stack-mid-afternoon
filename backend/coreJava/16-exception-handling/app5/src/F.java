class F
{
	static void test1() throws ClassNotFoundException
	{
		test2();
	}
	static void test2() throws ClassNotFoundException
	{
		test3();
	}
	static void test3() throws ClassNotFoundException
	{
		Class.forName("");
	}
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
}
/*
main begin
Exception in thread "main" java.lang.ClassNotFoundException:
        at java.lang.Class.forName0(Native Method)
        at java.lang.Class.forName(Unknown Source)
        at F.test3(f.java:13)
        at F.test2(f.java:9)
        at F.test1(f.java:5)
        at F.main(f.java:18)
		*/