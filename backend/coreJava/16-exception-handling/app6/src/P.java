class P 
{
	static void test() throws ClassNotFoundException
	{
	}
	public static void main(String[] args) 
	{
		System.out.println("mian begin");
		test();
		System.out.println("main end");
	}
}
/*
n.java:9: error: unreported exception Throwable; must be caught or declared to be thrown
                test();
                    ^
					*/