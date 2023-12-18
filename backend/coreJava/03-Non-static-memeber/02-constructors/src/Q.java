class Q
{
	Q()
	{
		System.out.println("q()");
	}
	q(int i)
	{
		// this keyword
		this();
		System.out.println("q(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Q q1 = new Q();
		System.out.println("-------------");
		Q q2 = new Q(10);
		System.out.println("-------");
		System.out.println("main end");
		

	}
}