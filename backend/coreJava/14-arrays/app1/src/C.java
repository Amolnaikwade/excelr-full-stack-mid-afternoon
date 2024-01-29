public class C
{
	public static void main(String[] args) 
	{
		int[] x;
			x = new int[3];
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		
		x[0] = 100;
		x[1] = 200;
		x[2] = 300;
		x  = null;
		System.out.println(x.length);
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		
	}
}
/* if you are calling anything on the 'null' referance then you would get NullPointerException
Ex: int[] x = new int[9];
x = null;
s.o.p(x.length); //nullpointer excption */