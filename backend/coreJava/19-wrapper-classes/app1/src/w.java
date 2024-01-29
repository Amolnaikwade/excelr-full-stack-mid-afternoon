class W
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		String value = "b";

		Character c1 = Character.valueOf(value);
		char c2 = c1.charValue();

		System.out.println(c2);
		System.out.println("done");
	}
}
/*
java:8: error: incompatible types: String cannot be converted to char
                Character c1 = Character.valueOf(value);
                                                 ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
*/