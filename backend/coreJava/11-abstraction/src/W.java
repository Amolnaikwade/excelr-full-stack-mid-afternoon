abstract class U
{
	U(int i)
	{
		System.out.println("U(int)");
	}
	abstract void test1();
}

abstract class V extends U{
	V()
	{
		super(90);
		System.out.println("from v()");
	}
}
class W extends V

{
	W()
	{
		System.out.println("W()");
	}
	void test1()
	{
		System.out.println("from test1()");
	}


	public static void main(String[] args) 
	{
		W obj = new W();
		System.out.println();
		obj.test1();

		System.out.println("Hello World!");
	}
}
/*
U(int)
from v()
W()

from test1()
Hello World!
*/