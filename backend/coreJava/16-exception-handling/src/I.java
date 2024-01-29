class I 
{
	public static void main(String[] args) 
	{
		int i = 99999999999;
		System.out.println("main begin");
		//int[] x = new int[999999999999];
		System.out.println("main end");
	}
}
/*
java:6: error: integer number too large: 999999999999
                int[] x = new int[999999999999];
                                  ^
1 error
*/