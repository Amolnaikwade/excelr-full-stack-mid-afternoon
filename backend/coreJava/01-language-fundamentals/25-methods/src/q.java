class q
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
				return 100;
	}
}
/*
main begin
from test
main end
*/