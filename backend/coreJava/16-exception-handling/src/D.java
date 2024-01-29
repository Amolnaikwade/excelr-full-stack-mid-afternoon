class D 

{
	public static void main(String[] args) 
	{
		System.out.println("mian begin");
		Object obj = new Object();
		D d1 = (D) obj;
		System.out.println("main end");
	}
}
/*
mian begin
Exception in thread "main" java.lang.ClassCastException: java.lang.Object cannot be cast to D
        at D.main(d.java:8)

*/