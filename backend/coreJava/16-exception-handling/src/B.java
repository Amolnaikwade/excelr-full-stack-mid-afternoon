class B 
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int[] x = {12, 30,20};
		int i = x[3];
		System.out.println("main end");
	}
}
/*
ain begin
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at B.main(B.java:7)

*/