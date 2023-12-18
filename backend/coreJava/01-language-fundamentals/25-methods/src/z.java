class z
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i= test() + (test() * test());
		System.out.println(i);
		System.out.println("main end");
			 
		}
		static int test()
	{
				System.out.println("from test ");
				return 100;
	}
}
/*
main begin
from test
from test
from test
10100
main end
*/