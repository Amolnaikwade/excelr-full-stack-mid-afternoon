public class S
{
	//var arg, any no. of int arg can be supplied, even 0 no. also
	//var arg introduced in JDK 1.5
	static void test(int     ...          arg)
	{
		System.out.println("test(var-args)");
	}
	public static void main(String [] args)
	{
		test();
		test(10);
		test(10,30);
		test(40,50,90);
		test(8,240,150,910);
	}
}
/*
test(var-args)
test(var-args)
test(var-args)
test(var-args)
test(var-args)
*/