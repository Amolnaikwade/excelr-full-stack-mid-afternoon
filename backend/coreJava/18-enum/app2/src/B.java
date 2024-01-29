class B 
{
	enum A
	{
		CON(100), TEST(200,"true");
		A(int i)
		{
			System.out.println("A(int): " + i);

		}
		A(int i, String str)
		{
			System.out.println("A(int, String): " + i + ": " + str);
		}
	}
	public static void main(String[] args) 
	{
		A a1 = A.TEST;
		System.out.println(a1);
	}
}
/*
A(int): 100
A(int, String): 200: true
TEST
an
*/