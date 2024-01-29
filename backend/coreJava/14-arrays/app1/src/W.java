class W 
{
	public static void main(String[] args) 
	{
		int[] x = new byte[4];
		System.out.println("done");
	}
}
/*
 error: incompatible types: byte[] cannot be converted to int[]
                int[] x = new byte[4];
                          ^
1 error
- in case of arrays there wont be any casting -casting is not possible
Ex- int[] x = new byte[4];
-because arrays are not same as primitives
*/