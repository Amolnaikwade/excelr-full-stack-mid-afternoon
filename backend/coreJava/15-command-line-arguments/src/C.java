class C 
{
	public static void main(String[] args) 
	{
		System.out.println("Total No. of arguments: " + args.length);
		for(String str : args)
		{
			System.out.println("argument: " + str);
		}
	}
}
/*
all the command line arguments will be converted to the String type. 
-we need to supply command line arguments by using sace as a seperator.
*/