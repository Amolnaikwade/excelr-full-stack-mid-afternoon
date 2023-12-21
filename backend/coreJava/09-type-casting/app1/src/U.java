class U 
{
	public static void main(String[] args) 
	{
		double d = 10.0;
		float f = (float)d;
		long l = (long)f;
		int i = (int)l;
		short s = (short)i;
		byte b = (byte)s;
		System.out.println("d: " + d + ", " + "f: " + f + ", " + "l: " + l + ", " + "i: " + i + ", " + "s: " + s + ", " + "b: " + b);
	}
}

//d: 10.0, f: 10.0, l: 10, i: 10, s: 10, b: 10
