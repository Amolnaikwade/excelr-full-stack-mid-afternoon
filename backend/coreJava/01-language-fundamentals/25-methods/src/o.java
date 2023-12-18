class o
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
			 
		}
		static int test()
	{
				System.out.println("from test");
				return;
	}
}
/*
java:13: error: incompatible types: missing return value
                                return;
                                ^
*/