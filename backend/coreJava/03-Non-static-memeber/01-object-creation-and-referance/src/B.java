class B
{
	int i;
	public static void main(String[] args) 
	{
		System.out.println(B.i);
	}
}
/*
 error: non-static variable i cannot be referenced from a static context
                System.out.println(i);
                                   ^
1 error
*/