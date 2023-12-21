class S
{
	static void test(int i)
	{
		System.out.println("test(int): " + i);
	}
	public static void main(String[] args) 
	{
		byte b = 10;
		test(b);
		double d = 10.0;
		test((int)d);
		System.out.println("done");
	}
}
//test(int): 10
//test(int): 10
//done