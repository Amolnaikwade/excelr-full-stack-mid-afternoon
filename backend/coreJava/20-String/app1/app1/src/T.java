class T 
{
	public static void main(String[] args)
	{
		String s1 = "abc" + 5 + 6;//string concatenation
		String s2 = 5 + "abc" + 6;
		String s3 = 5 + 6 + "abc";
		System.out.println(s1);//abc56
		System.out.println(s2);//5abc6
		System.out.println(s3);//11abc
	}
}
