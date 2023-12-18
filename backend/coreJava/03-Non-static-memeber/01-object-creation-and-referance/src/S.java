class S

{
	int i;
	static void test(S obj)
	{
		obj.i = 20;
	}
	public static void main(String[] args) 
	{
		S s1 = new S();
		s1.i = 10;
		System.out.println("before calling test(S):  " + s1.i );
		//call by refreance or Pass by referance.
		//changing in the destination would reflect tothe source.
		//its like we are sending the key to the object itself by suling the referance.
		//if you are sending a referance there would be a 100% chance to midify the object data memebers.
		s1.test(s1);
		System.out.println("after calling test(S):  " + s1.i );
	}
}
/*
before calling test(S):  10
after calling test(S):  20
*/