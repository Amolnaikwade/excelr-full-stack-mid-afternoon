//enum advance 
enum V 
{
	C1, C2, C3;
	V()
	{
		System.out.println("v()");
	}
	{
		System.out.println("IIB");
	}
	static
	{
		System.out.println("SIB: " + V.C1);

	}
}
class A
{

	public static void main(String[] args) 
	{		
		V v1 = V.C3;
		System.out.println(v1);
	}
}
