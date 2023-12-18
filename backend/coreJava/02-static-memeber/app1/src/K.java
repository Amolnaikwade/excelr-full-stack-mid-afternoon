class  K
{
	static int x=0;
	static void test1()
	{
		System.out.println("from test1: " + x);
		x = 1;
	}
	static void test2()
	{
		System.out.println("from test2: " + x);
		x = 2;
	}
	
	public static void main(String[] args) 
	{
		test1();
		System.out.println("main1: " + x);
		test2();
		System.out.println("main2: " + x);
		
	}
}
/*
from test1: 0
main1: 1
from test2: 1
main2: 2
*/