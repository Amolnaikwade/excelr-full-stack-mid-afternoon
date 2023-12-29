interface M
{
	void test1();
	int test2(int i);

}
class N implements M
{
	public void test1()
	{
		System.out.println("from test 1()");
	}
	public int test2(int i)
	{
		System.out.println("from test 2(int i)");
		return 0;
	}
	public staic void main(String[] args)
	{
		N obj1 = new N();
		obj1.test1();
		obj.test2(10);
	}
}