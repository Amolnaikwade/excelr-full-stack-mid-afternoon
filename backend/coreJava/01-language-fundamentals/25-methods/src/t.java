class t
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
				return "abc";
	}
}
/*
java:13: error: incompatible types: String cannot be converted to int
                                return "abc";
                                       ^
1 error
*/