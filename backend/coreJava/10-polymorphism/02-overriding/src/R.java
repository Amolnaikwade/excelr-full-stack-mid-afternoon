class Q
{
	public void test1()
{
	System.out.println("from test1-q");
}
}
class R extends Q
{
	 public void test1()
{
	System.out.println("from test1-P");
	
}

	public static void main(String[] args) 
	{
		Q obj1 = new Q();
		obj1.test1();
		System.out.println("done");
	}
}
/*from test1-q
done
*/