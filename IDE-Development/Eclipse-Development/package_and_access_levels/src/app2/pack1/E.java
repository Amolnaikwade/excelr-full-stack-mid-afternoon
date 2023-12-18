package app2.pack1;
class D
{
	private void test1()
	{
		System.out.println("from D.test1()");
	}
	//default friendly
	//void test1()
	{
		System.out.println("from D.test1()");
	}

}
//class E extends D

//{

//{
	public static void main(String[] args) 
	{
//		E obj = new E();
//		obj.test1();
//		obj.test2();
		System.out.println("Hello World!");
	}
}
// default same class- yes
//same pkg sub class -yes
//outside pkg- no