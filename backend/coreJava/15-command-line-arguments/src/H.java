class H 
{
	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k= i*j;
		System.out.println("multiplication is: "+ k);
		for(String str : args)
		{
		System.out.println("arguments is: " + str);
		}
	}
}
