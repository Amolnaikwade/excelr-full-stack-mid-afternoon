class L
{
	public static void main(String[] args) 
	{
		String s1 = "10$235";

		Float obj1 = new Float(s1);
	
		float i = obj1.floatValue();
	
		System.out.println(i);
	}
}
/*
Exception in thread "main" java.lang.NumberFormatException: For input string: "10$235"
        at sun.misc.FloatingDecimal.readJavaFormatString(Unknown Source)
        at sun.misc.FloatingDecimal.parseFloat(Unknown Source)
        at java.lang.Float.parseFloat(Unknown Source)
        at java.lang.Float.<init>(Unknown Source)
        at L.main(L.java:7)
		*/