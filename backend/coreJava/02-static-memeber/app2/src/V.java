class U
{
	static int i = 10;
	static 	
	{
			System.out.println("SIB-U" );
	}
}
class V
{
	static
	{
	System.out.println("V-SIB");
	}
	public static void main(String[] args)
		{
		System.out.println("V-main-begin");
		System.out.println(U.i);
		System.out.println(U.i);
		System.out.println(U.i);
		System.out.println("V-main-end");
	}
}
/*  
V-main-begin
SIB-U
10
10
10
V-main-end

 */                                           