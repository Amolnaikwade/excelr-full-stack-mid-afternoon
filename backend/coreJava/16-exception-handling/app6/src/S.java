class R 
{
	R() throws ClassNotFoundException 
	{
	}
}
class S
{

	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		R r1 = new R();
		System.out.println("main end");
	}
}
/*
s.java:9: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                R r1 = new R();
                       ^
1 error
*/