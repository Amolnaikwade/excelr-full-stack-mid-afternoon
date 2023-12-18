class O 
{
	O()
	{
		System.out.println("O()");
	}
	O(int i)
	{
		this();
		System.out.println("O(int i)");
	}
}
	class P extends O
	
	{
		P()
		{
			super(10);
			System.out.println("P()");
		}
		P(int i)
	{
		this();
		System.out.println("O(int i)");
	}
	}
	class Q extends P
	
	{
		Q()
		{
			super(90);
			System.out.println("Q()");
		}
		Q(int i)
	{
		this();
		System.out.println("Q(int i)");
	}
	}
	class R extends Q
	
	{
		R()
		{
			super(90);
			System.out.println("R()");
		}
		R(int i)
	{
		this();
		System.out.println("R(int i)");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main begin ");
		O obj = new O();
		System.out.println("----------- ");
		
		O obj2 = new O(10);
		System.out.println("----------- ");

		P obj3 = new P();
		System.out.println("----------- ");

		P obj4 = new P(100);
		System.out.println("----------- ");

		Q obj5 = new Q();
		System.out.println("----------- ");

		
		 Q obj6 = new Q(1000);
		System.out.println("----------- ");

		R obj7 = new R();
		System.out.println("----------- ");

		R obj8 = new R(10000);
		System.out.println("----------- ");
		System.out.println("main end ");
	}
}
/*
main begin
O()
-----------
O()
O(int i)
-----------
O()
O(int i)
P()
-----------
O()
O(int i)
P()
O(int i)
-----------
O()
O(int i)
P()
O(int i)
Q()
-----------
O()
O(int i)
P()
O(int i)
Q()
Q(int i)
-----------
O()
O(int i)
P()
O(int i)
Q()
Q(int i)
R()
-----------
O()
O(int i)
P()
O(int i)
Q()
Q(int i)
R()
R(int i)
-----------
main end
*/