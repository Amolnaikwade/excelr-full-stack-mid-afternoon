class C 
{
	int x;
	C()
	{
		x++;

	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("A: "+ c1.x);
		C c2 = new C();
		System.out.println("A: "+ c2.x);
		C c3 = new C();
		System.out.println("A: "+ c3.x);
		C c4 = new C();
		System.out.println("A: "+ c4.x);
		C c5 = new C();
		System.out.println("A: "+ c5.x);
	}
}
/*
A: 1
A: 1
A: 1
A: 1
A: 1
*/