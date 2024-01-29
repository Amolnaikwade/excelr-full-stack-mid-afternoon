import java.util.Arrays;
public class S 
{
	public static void main(String[] args) 
	{
		int[] x = new int[] {10,20,30,40};

		System.out.println(x.length);
		System.out.println(Arrays.toString(x));
	}
}
/*
Another way of creating array object
Ex:
new int[] {10,20,30,40};
-we are not specifing the size explicitly, because by supplying the elemnt in the curly brace {} we are the telling size indirectly.
-we don't have to idividualy initialize array indexes. accourding to elemnts that are inside the curly bracecs{}, indexes would be initialized.
*/