class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
/*
main begin
java.lang.ClassNotFoundException:
        at java.lang.Class.forName0(Native Method)
        at java.lang.Class.forName(Unknown Source)
        at N.main(n.java:8)
main end

-we can hancle byusing try catch.
*/