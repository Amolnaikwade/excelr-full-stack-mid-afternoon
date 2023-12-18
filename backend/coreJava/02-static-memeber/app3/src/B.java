class B
{
	static{
		System.out.println("B-SIB1");
	}
	public static void main(String[] args) 
	{
		System.out.println("B-main-begin");
		A.main(args);
		System.out.println("- - - - -");
			A.main(null);
		System.out.println("B-main-end");
	}	
	static{
		System.out.println("B-SIB2");
	
	}
}
/*

B-SIB1
B-SIB2
B-main-begin
A-SIB1
A-SIB2
A-SIB3
A-SIB4
A-MAin
- - - - -
A-MAin
B-main-end

*/