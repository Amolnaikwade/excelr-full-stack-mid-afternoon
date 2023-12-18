class I
{
	static int i = test1();
	static int j = test2();
	static int test1()
	{
		System.out.println("from test1");
		return 10;

	}
	static int test2()
	{
		System.out.println("from test2");
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(test1());
		System.out.println(test2());
	
		
	}
}
/*
from test1
from test2
10
20
from test1
10
from test2
20
*/