class s
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
			 
		}
		static boolean test()
	{
				System.out.println("from test");
				return false;
	}
}
/*
main begin
from test
main end
*/