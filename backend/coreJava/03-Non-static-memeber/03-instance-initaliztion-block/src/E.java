class E
{
static
	{
			System.out.println("STB1");

	}

	{
	System.out.println("E()");
	}
	E( int i)
	{
		this();
			System.out.println("E(int)");
	}
	E( int i)
	{
		this();
			System.out.println("E(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
			E e1 = new E();
			System.out.println("----------");
			E e2 = new E(10);
			System.out.println("----------");
	}
		{
			System.out.println("IIB2");
		}
			static{
				System.out.printl("SIB2");
		}


	
}
/*
Hello World!
IIB1p
IIB2
D()
----------
IIB1
IIB2
D()
D(int)
----------
*/