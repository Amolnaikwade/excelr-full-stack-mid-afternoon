class V 
{
	V()
	{
		this();
		System.out.println("V()");
	}
}
/*
java:3: error: recursive constructor invocation
        V()
        ^
1 error
*/