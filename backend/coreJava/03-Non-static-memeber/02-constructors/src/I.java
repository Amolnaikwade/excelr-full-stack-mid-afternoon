class I 
{
	I()
	{
		System.out.println("I()");
	}
	public static void main(String[] args) 
	{
		I i1 = new I(10);
		System.out.println("done");
	}
}
/*
 error: constructor I in class I cannot be applied to given types;
                I i1 = new I(10);
                       ^
					   */