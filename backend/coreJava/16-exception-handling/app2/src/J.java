import java.util.Scanner;
class j
{
	public static void main(String[] args) 
	{
		System.out.println("enter sentence!");
		String s1 = new Scanner(System.in).nextLine();
		try
		{
			System.out.println("try begin");
			int i = Integer.parseInt(s1);
			System.out.println("++++++++++++");
			int k = i/0;
			System.out.println("try end");
		}
		catch (NumberFormatException ex2)
		{
			System.out.println("from catch: " + ex2);
		}
		catch (NumberFormatException ex2)
		{
			System.out.println("from catch: " + ex2);
		}
		finally
		{
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}