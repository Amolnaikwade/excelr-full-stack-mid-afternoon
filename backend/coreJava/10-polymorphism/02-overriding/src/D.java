class C
{
void test()
{
System.out.println("from test-c");
}
}
class D extends C
{
void test()
{
System.out.println("from test-D");
}

	public static void main(String[] args) 
	{
C c1 = new C();
c1.test();
		System.out.println("done");
	}
}
//from test-D
//done