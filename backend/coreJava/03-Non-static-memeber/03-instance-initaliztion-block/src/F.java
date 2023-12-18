class F
{
static
	{
			System.out.println("STB1");

	}

	{
	System.out.println("F()");
	}
	F()
	{
		
			System.out.println("F(int)");
	}
	F( int i)
	{
		this();
			System.out.println("F(int)");
	}
	F( int i, int j)
	{
		this(j);
			System.out.println("F(int, int )");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
			F f1 = new F();
			System.out.println("----------");
			F f2 = new F(10);
			System.out.println("----------");
			F f3 = new F(10,20);
			System.out.println("----------");
	}
		{
			System.out.println("IIB2");
		}
			static{
				System.out.println("SIB2");
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