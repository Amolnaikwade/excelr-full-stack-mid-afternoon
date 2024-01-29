public class G 
{
	public static void main(String[] args) 
	{
		int i = +10;
		String []x = new String[i];
		System.out.println(x.length);
		System.out.println("-------");
		i = +0;
		String []y = new String[i];
		System.out.println(y.length);
		System.out.println("--------");
		i = -2;
		String []z = new String[i];
		System.out.println(z.length);
		System.out.println("---------");
	}
}
/*
-we can create array with size 0, array would not have any indexes.
String []y = new String[0];
- we can specify array size with an 'int' value.
- we can able to create an array with the -ve size, otherwise you would get 'NegativeArraySizeException'.
String []z = new String[-2];//NegativeArraySizeException: -2.


o/p
10
-------
0
--------
Exception in thread "main" java.lang.NegativeArraySizeException
        at G.main(g.java:14)


		*/