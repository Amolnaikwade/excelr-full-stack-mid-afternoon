class D
{

	{
			System.out.println("IIB1");

	}
	D()
	{
	System.out.println("D()");
	}
	D(int i)
	{
		this();
			System.out.println("D(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
			D d1 = new D();
			System.out.println("----------");
			D  d2 = new D(10);
			System.out.println("----------");
	}
		{
			System.out.println("IIB2");
		}

	
}
/*
Hello World!
IIB1
IIB2
D()
----------
IIB1
IIB2
D()
D(int)
----------
*/