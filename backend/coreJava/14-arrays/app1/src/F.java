public class F

{
	public static void main(String[] args) 
	{
		int x[] = new int[4];
		System.out.println(x.length);
		System.out.println("-------");
		for(int i=0; i< x.length; i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("------");
		for(int i : x)
		{
			System.out.println(i);
		}
	}
}
/*
4
-------
0
0
0
0
------
0
0
0
0

when you are iterating an array using normal for loop then must start or initialize the variable from 0. because aRRay index start from 0.
*/