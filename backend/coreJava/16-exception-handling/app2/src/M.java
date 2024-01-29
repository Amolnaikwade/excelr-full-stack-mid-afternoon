class M
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
			try
			{
				int i = 10 / 0;
			}
			catch (ArithmeticException ex)
			{
			}
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