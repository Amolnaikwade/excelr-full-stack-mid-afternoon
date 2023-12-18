class P 
{
	P()
	{
		System.out.println("P()");
	}
	P(int i)
	{
		// this keyword
		this();
		System.out.println("P(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		P p1 = new P();
		System.out.println("-------------");
		P p2 = new P(10);
		System.out.println("main end");
		

	}
}
/*
ain begin
P()
-------------
P()
P(int)
main end
*/
