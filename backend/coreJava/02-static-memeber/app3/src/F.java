class F
{
	
	static
		{
		System.out.println(i);//usage is not allowed before 
							 //its decleration
	}
	static int i = 2;
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
/*
error: illegal forward reference
                System.out.println(i);
*/