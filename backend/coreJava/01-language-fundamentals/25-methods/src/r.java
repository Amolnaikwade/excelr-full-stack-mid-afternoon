class r
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
			 
		}
		static String test()
	{
				System.out.println("from test");
				return "ABC";
	}
}
/*
main begin
from test
main end
*/