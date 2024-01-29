class D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
		}
		catch (ClassNotFoundException ex)
		{
		}
		System.out.println("main end");
	}
}
//1. try can be empty if the catch is un-checked type
//2. try cant be empty if the catch is checked type
//3.oyher wise you will gate  -> 'checked catch argument type' 