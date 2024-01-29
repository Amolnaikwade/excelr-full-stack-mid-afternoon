class G 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a sentence!");
		String s1 = new Scanner(System.in).nextLine();
		try
		{
			System.out.println("try begin");
			
			int k = i / 0;
			System.out.println(" try end");

		}
		catch (NumberFormatException  ex2)
		{
			System.out.println("outer catch begin")

			System.out.println("from nested try-catch: " + ex2);
		}
		
		System.out.println("outer catch end");
	}
			System.out.println("main  end");

}

