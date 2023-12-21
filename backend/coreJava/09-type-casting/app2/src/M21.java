class M21 
{
public static void test(Object obj)
{
if(obj instanceof Object)
{
System.out.println("we can cast to object");
Object obj1 = (Object)obj;
}
else if(obj instanceof A)
{
System.out.println("we can cast to A");
A a1 = (A)obj;
}
else if(obj instanceof B)
{
System.out.println("we can cast to A");
B b1 = (B)obj;
}
else if(obj instanceof C)
{
System.out.println("we can cast to A");
C c1 = (C)obj;
}
else if(obj instanceof D)
{
System.out.println("we can cast to A");
D d1 = (D)obj;
}
}
	public static void main(String[] args) 
	{
Object obj1 = new A();
test(obj1);
		System.out.println("-------------");
Object obj2 = new B();
test(obj2);
		System.out.println("-------------");
Object obj3 = new B();
test(obj3);
		System.out.println("-------------");
Object obj4 = new C();
test(obj4);
		System.out.println("-------------");
Object obj5 = new D();
test(obj5);
		System.out.println("-------------");
	}
}
/*
we can cast to object
-------------
we can cast to object
-------------
we can cast to object
-------------
we can cast to object
-------------
we can cast to object
-------------
*/
