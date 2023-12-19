class T
{
	static int test(double d)
	{
		System.out.println("test(double): " + d);
		return (int)d;
	}
	public static void main(String[] args) 
	{
		int i = test(200);
		long l = test(10.0);
		System.out.println("i: "+ i+ ", " + "l" + l + " done" );
	}
}
//test(double): 200.0
//test(double): 10.0
//i: 200, l10 done