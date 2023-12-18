class L
{
	static int i = test();

	static
		{
		System.out.println("SIB1 begin");
		main(null);
		System.out.println("SIB1 end");
	}
	static int test()
	{
		System.out.println("test begin");
	    main(null);
		System.out.println("test end");
		return 20;
	}

	public static void main(String[] args) 
	{
		System.out.println("main: " +i);
		
	
	}
}
/*
test begin
main: 0
test end
SIB1 begin
main: 20
SIB1 end
main: 20

*/