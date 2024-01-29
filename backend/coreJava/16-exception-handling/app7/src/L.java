class L
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
		}
		catch (String str)
		{
		}
		System.out.println("main end");
	}
}
//catch should be always Throwable or sub-class to to Throwable type
/*
L.java:9: error: incompatible types: String cannot be converted to Throwable
                catch (String str)
                       ^
1 error

*/