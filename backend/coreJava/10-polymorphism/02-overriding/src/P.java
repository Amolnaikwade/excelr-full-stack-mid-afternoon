class O
{
	void test1()
{
	System.out.println("from test1-o");
}
}
class P extends O
{
	protected void test1()
{
	System.out.println("from test1-P");
	
}

	public static void main(String[] args) 
	{
		P obj1 = new P();
		obj1.test1();
		System.out.println("done");
	}
}
/*from test1-p
done
*/