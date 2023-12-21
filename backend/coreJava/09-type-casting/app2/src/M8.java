class M8 
{
static void test(A obj)
{
System.out.println("from test(A)");
}
	public static void main(String[] args) 
	{
test(new B());
test(new D());
test(new D());

B b1 = new B();
test(b1);

D d1 = new D();
test(b1);
		System.out.println("done");
	}
}
/*
from test(A)
from test(A)
from test(A)
from test(A)
from test(A)
done
*/