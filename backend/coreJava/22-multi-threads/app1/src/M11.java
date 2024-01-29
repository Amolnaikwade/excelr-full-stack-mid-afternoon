public class M11 
{
	public static void main(String[] args)
	{
		Thread  t1 = Thread.currentThread();
		System.out.println(t1.isDaemon());
		//before starting only we can convert it to daemon 
		 //trying to convert after starting resulting in Exception.
		//RE - ITSE
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
	}
}
/*
false
Exception in thread "main" java.lang.IllegalThreadStateException
        at java.lang.Thread.setDaemon(Unknown Source)
        at M11.main(M11.java:10)

*/