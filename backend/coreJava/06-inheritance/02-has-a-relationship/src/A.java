class A 
{
	int i;
	void test1(){
		System.out.println("A-test1()");
	}
}
class B
{
		
		A obj;
		B(B ref)
	{
			this.obj = ref;

			
	}
	void test2()
	{
		System.out.println("B-test2()");
		System.out.println("obj.i");
		obj.test1();
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		F f1 = new f(a1);
		f1.test2();
		System.out.println("done");
	}
}
