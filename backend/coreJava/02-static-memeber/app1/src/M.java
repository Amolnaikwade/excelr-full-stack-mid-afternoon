class M
{
	static int i = 100;
	public static void main(String[] args) 
	{
		System.out.println("a: " + i);
		 int i = 10;
		System.out.println("b: " + M.i);
		i = 20;
		System.out.println("c: " + i);
	}
}
/*
a: 100
b: 100
c: 20
*/