class K
{
	void test1()
{
	System.out.println("from test1-K");
}
}
class L extends K
{
	private void test1()
{
	System.out.println("from test1-l");
	return 10;
}

	public static void main(String[] args) 
	{
		L obj1 = new L();
		obj1.test1();
		System.out.println("done");
	}
}
/*.java:10: error: test1() in L cannot override test1() in K
        private void test1()
                     ^
  attempting to assign weaker access privileges; was package
l.java:13: error: incompatible types: unexpected return value
        return 10;
*/