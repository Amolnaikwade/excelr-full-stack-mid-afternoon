class z2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(test());
		System.out.println("main end");
			 
		}
		static void test()
	{
				System.out.println("from test ");
	}
}
/*
java:6: error: 'void' type not allowed here
                System.out.println(test());
                                       ^

*/