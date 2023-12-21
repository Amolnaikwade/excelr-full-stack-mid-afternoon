class M11
{
	public static void main(String[] args) 
	{
		// A a1 = new A();
		//B b1 = (B) new A();//force fully we can down casting

A a1 = new B();
B b1 = (B)a1;
		System.out.println("done");
	}
}
// A cannot be cast to B
//        at M11.main(M11.java:6)