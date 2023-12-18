class S
{
	static
	{
				System.out.println("SIB1");

	}
	S()
	{
		System.out.println("s()");
	}
	{
		{
		System.out.println("IIB1");
	}
	}
	S(int i)
	{
		this();
		System.out.println("s(int i)");
	}
	static{
		
		System.out.println("SIB-2");
	
	}
	
}
	class T extends S
	
	{
		static
	{
				System.out.println("t-SIB1");

	}
		T()
		{
			super(10);
			System.out.println("t()");
		}
		T(int i)
	{
		this();
		System.out.println("T(int i)");
	}
	static
	{
				System.out.println("t-SIB2");

	}
	}
	class U extends T
	
	{
		static
	{
				System.out.println("u-SIB1");

	}
		U()
		{
			super(90);
			System.out.println("u()");
		}
		{
		System.out.println("IIB1");
	}
		U(int i)
	{
		this();
		System.out.println("u(int i)");
	}
	static
	{
				System.out.println("u-SIB2");

	}
	}
	class V extends U
	
	{
		static
	{
				System.out.println("v-SIB1");

	}
		V()
		{
			super(90);
			System.out.println("v()");
		}
		{
		System.out.println("IIB1");
	}
		V(int i)
	{
		this();
		System.out.println("v(int i)");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main begin ");
		S obj = new S();
		System.out.println("----------- ");
		
		S obj2 = new S(10);
		System.out.println("----------- ");

		T obj3 = new T();
		System.out.println("----------- ");

		T obj4 = new T(100);
		System.out.println("----------- ");

		U obj5 = new U();
		System.out.println("----------- ");

		
		 U obj6 = new U(1000);
		System.out.println("----------- ");

		V obj7 = new V();
		System.out.println("----------- ");

		V obj8 = new V(10000);
		System.out.println("----------- ");
		System.out.println("main end ");
	}
	static
		{
		System.out.println("V-sib-2");
		}
}