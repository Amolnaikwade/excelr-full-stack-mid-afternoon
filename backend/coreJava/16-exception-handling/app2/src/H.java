import java.util.Scanner;
class H
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
finally is keyword is in java
- finally is a block that we are using along with the try catch blocks.
-weather execption is tgere or not and wheather the rased exception object gets handeld or not but compulsory finally blick would be executing.
-we can able to use finally block to close the resourse that we have used we don't need any more.


*/