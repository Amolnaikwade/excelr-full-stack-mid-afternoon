import java.util.Scanner;
class M
{
	public static void main(String[] args) throws Scanner
	{
		System.out.println("main begin");
		System.out.println("main end");
	}
}
//throws should be always Throwable type or sub-class to to Throwable type
/*
m.java:4: error: incompatible types: Scanner cannot be converted to Throwable
        public static void main(String[] args) throws Scanner
                                                      ^
1 error
*/