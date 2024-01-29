import java.util.Arrays;
public class T
{
	public static void main(String[] args) 
	{
		int[] x = new int[4] {10,20,30,40};

		System.out.println(x.length);
		System.out.println(Arrays.toString(x));
	}
}
/*
error
- This one is invalid
- int[] x = new int[4] {10,20,30,40};
*/