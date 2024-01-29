public class X
{
	static void test(int x, String...y)
	{
		System.out.print("x value: " + x);
		System.out.println(" and length of the var-arg y : " + y.length);
		System.out.println("----------");
	}
	public static void main(String [] args)
	{
		//test();
		test(10);
		test(1,"abc");
		test(30,"xyz","hello");
		test(40,"done","check","hello");
	}
}

/*
x value: 10 and length of the var-arg y : 0
----------
x value: 1 and length of the var-arg y : 1
----------
x value: 30 and length of the var-arg y : 2
----------
x value: 40 and length of the var-arg y : 3
----------
*/