class E
{
	
	public void test() 
	{
		System.out.println("from test");
	}
	public static void main2(String[] args) 
	{
		System.out.println("from main begin");
		test();
		System.out.println("from main end");
	}
	
}
// non-static method test() cannot be referenced from a static context
  //              test()