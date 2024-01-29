class R
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		String str = "a";
		Character c2 = new Character(str);
		char ch3 = c2.charValue();
		System.out.println(ch3);
	}
}
/*
java:7: error: incompatible types: String cannot be converted to char
                Character c2 = new Character(str);
                                             ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
*/