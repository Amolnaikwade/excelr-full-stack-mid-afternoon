
class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("from try");
			
		}
		catch (NumberFormatException ex)
		{
			System.out.println("from catch: " + ex);
		}
		
		finally
		{
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
/*
main begin
from try
from finally
main end
*/