class M
{
	void test1()
{
	System.out.println("from test1-K");
}
}
class N extends M
{
	protected void test1()
{
	System.out.println("from test1-l");
	
}

	public static void main(String[] args) 
	{
		N obj1 = new N();
		obj1.test1();
		System.out.println("done");
	}
}
/*from test1-l
done
*/