class F 
{
	int i;

	F()
	{
		System.out.println("F()");
		i = 10;
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i);
	}
}
//F()
//10
//what is need of construtor?
//construtir are used to initialize the objects.
//non-static member can be used without any referance variable in the non-static context.