class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1 = null;
		int i = s1.length();
		System.out.println("main end");
	}
}
/*
main begin
Exception in thread "main" java.lang.NullPointerException
        at C.main(c.java:7)


		*/