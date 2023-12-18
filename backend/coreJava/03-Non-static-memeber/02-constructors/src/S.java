class S 
{
	S()
	{
		System.out.println("S()");
		this(10);
	}
	S(int i)
	{
		System.out.println("S(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		S s1 = new S();
		System.out.println("---------------");
		S s1 = new S();
		System.out.println("---------------");
		System.out.println("main end");
	}
}
/*
 error: call to this must be first statement in constructor
                this(10);
                    ^
s.java:17: error: variable s1 is already defined in method main(String[])
                S s1 = new S();
				*/