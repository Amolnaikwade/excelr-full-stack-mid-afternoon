class z3
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
			 
		}
		static void test(int i)
	{
				System.out.println("from test ");
	}
}
/*
.java:6: error: method test in class z3 cannot be applied to given types;
                test();
                                       ^

*/