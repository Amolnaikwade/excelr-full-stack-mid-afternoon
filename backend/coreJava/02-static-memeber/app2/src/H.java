class H
{
	public static void main(String[] args) 
	{
		System.out.println("from h begin");
		System.out.println(G.i);
		System.out.println(G.test());
		System.out.println("from h end");
	}
}
/*
from h begin
from test
10
from test
10
from h end
*/