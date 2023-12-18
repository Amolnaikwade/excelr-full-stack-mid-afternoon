class T

{
	int i;

	static void test(int i)
	{
		i = 20;
	}
	public static void main(String[] args) 
	{
		T t1 = new T();
		t1.i = 10;
		System.out.println("before calling test(S):  " + t1.i );
		//call by value or Pass by value
		//we are not a referance instead just the value ,
		//in this case there is no chance of modification to the object
		T.test(t1.i);
		System.out.println("after calling test(S):  " + t1.i );
	}
}
/*
before calling test(S):  10
after calling test(S):  10
*/