class A 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class.forName("");
	}
}
/*
Exception in thread "main" java.lang.ClassNotFoundException:
        at java.lang.Class.forName0(Native Method)
        at java.lang.Class.forName(Unknown Source)
        at A.main(A.java:5)

-we can use throws keyword for any method .
-mainly we are going to use throws for handing over the responsibility of handling checked exception to another block/jvm.
*/