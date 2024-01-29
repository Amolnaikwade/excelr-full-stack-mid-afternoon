class C
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("hello");
		sb.concat("test");
	}
}
/*
 error: cannot find symbol
                sb.concat("test");
                  ^
  symbol:   method concat(String)
  location: variable sb of type StringBuffer
1 error
*/