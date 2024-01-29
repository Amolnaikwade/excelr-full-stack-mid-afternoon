class S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("from try begin");
			int i = 10 / 0;
			System.out.println("from try end");
		}
		catch (ArithmeticException ex)
		{
			i = 20;
		}
		System.out.println("main end");
	}
}
/*


Even if there is a 'return ' statement either in the try or catch , once the control enter the try 

try{
	return;
	}
	catch(AE ex)
	{
	}
	finally
	{
		sop("from finally")
		}
*/