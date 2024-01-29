class M
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		
		for(int i = 0; i<s1.length(); i++)
		{
			System.out.println(s1.charAt(i));
		}
		char[] chars = s1.toCharArray();//built in method
		for(int i = 0; i < chars.length; i++)
		{
			System.out.println(chars[i]);
		}
	}
}
