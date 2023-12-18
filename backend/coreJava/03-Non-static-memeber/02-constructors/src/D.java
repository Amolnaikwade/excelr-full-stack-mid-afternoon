class D
{
	D()
	{
		System.out.println("c() begin");
		for(int i=1;i <= 10; i++)
		{
			System.out.println("from looP: " + i);
		}
		System.out.println("D() end");
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("done");
	}
}
/*
c() begin
from looP: 1
from looP: 2
from looP: 3
from looP: 4
from looP: 5
from looP: 6
from looP: 7
from looP: 8
from looP: 9
from looP: 10
D() end
done
*/