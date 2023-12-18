class F
{
	static int i = test();
	static int test()
	{
		System.out.println("From test");
		return 10;
	}
		
	public static void main(String[] args) 
	{ 
		System.out.println("Main begin");
		System.out.println(i);
		System.out.println("Main end");
	}
}
/*
  From test
Main begin
10
Main end
*/