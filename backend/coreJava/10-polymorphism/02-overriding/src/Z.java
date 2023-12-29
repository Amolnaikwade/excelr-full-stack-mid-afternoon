class Y
{
	  void test1()
{
	System.out.println("from test1-y");
}
}
class Z  extends Y
{
	  void test1()
{
	System.out.println("from test1.Z");
	
}

	public static void main(String[] args) 
	{
		Z obj1 = (Z) new Y();
		obj1.test1();
		System.out.println("done");
	}
}
/*.ClassCastException: Y cannot be cast to Z
        at Z.main(z.java:18)
*/