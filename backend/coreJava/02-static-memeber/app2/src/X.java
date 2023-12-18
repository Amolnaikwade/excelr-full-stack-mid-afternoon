class W
{
	static 	
	{
			System.out.println("W-SIB" );
	}
	static void test1()
	{
		System.out.println("from test1" );
	}
}
class X
{
	public static void main(String[] args)
		{
		System.out.println("_ _ _ _ _ _ ");
		W.test1();
		W.test1();
		W.test1();
		System.out.println("_ _ _ _ _ _ ");
	}
	static
	{
	System.out.println("X-SIB");
	}
	
}
/*  
X-SIB
_ _ _ _ _ _
W-SIB
from test1
from test1
from test1
_ _ _ _ _ _
 */                                           