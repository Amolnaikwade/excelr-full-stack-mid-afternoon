class M2
{
	public static void main(String[] args) 
	{
Object obj = null;
A a1 = null;
B b1 = null;
C c1 = null;
D d1 = null;
		System.out.println("obj: " + obj + ", " + a1 + ", " +" b1: "+ b1 + ", " + c1 + "c1: " + ", " + d1 + "d1: " );
System.out.println("------------------------------------------");
 obj = new Object();
 a1 = new A();
 b1 = new B();
 c1 = new C();
 d1 = new D();
		System.out.println("obj: " + obj + ", " + a1 + ", " +" b1: "+ b1 + ", " + c1 + "c1: " + ", "  + d1 + "d1: " );
	}
}
//obj: null, null,  b1: null, nullc1: , nulld1:
//------------------------------------------
//obj: java.lang.Object@15db9742, A@6d06d69c,  b1: B@7852e922, C@4e25154fc1: , D@70dea4ed1: