class A
{
	static{
		System.out.println("A-SIB1");
	}
	static{
		System.out.println("A-SIB2");
	}
	public static void main(String[] args) 
	{
		static{
		System.out.println("A-SIB3");
	}
	static{
		System.out.println("A-SIB4");
	}
	}
}
/*

10
from Z test

*/