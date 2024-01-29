class M 
{
	enum En
	{
		C1, C2, C3, C4;
	}
	enum Enum1
	{
		T1, T2, T3, T4;
	}
	public static void main(String[] args) 
	{
		Enum1 e1 = Enum1.C4;
		System.out.println(e1);
		Enum e2 = En.C3;
		System.out.println(e2);
		System.out.println("-----------------");

	}
}
