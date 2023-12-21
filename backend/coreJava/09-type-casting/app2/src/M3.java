class M3
{
public static void test1(A obj)
{
System.out.println("test1(A): " + obj);
}
public static void test2(B obj)
{
System.out.println("test1(B): " + obj);
} 
	public static void main(String[] args) 
	{
A a1 = new A();
test1(a1);

B b1 = new B();
test2(b1);
System.out.println(a1);
System.out.println(b1);
System.out.println("done");
System.out.println("------------------------");

A a2 = new A();
test1(a2);

B b2 = new B();
test2(b2);
System.out.println(a1);
System.out.println(b1);
	}
}
/*
test1(A): A@15db9742
test1(B): B@6d06d69c
A@15db9742
B@6d06d69c
done
------------------------
test1(A): A@7852e922
test1(B): B@4e25154f
A@15db9742
B@6d06d69c
*/