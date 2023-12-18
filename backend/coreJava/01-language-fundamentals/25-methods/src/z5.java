class z5
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100);
		System.out.println("main end");
			 
		}
		static void test(int i, int j)
	{
				System.out.println("from test ");
	}
}
/*


z5.java:6: error: method test in class z5 cannot be applied to given types;
                test(100);
                ^
  required: int,int
  found: int
  reason: actual and formal argument lists differ in length
1 error                              ^

*/