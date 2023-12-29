class E
{
void test1()
{
System.out.println("from test1-e");
}
}
class F extends E
{
void test1()
{
System.out.println("from test1-f");

}

	public static void main(String[] args) 
	{
F f1 = new F();
f1.test1();
		System.out.println("done");
	}
}
/*f.java:13: error: incompatible types: unexpected return value
return 10;
       ^
f.java:19: error: method test1 in class E cannot be applied to given types;
e1.test1(10);
  ^
  required: no arguments
  found: int
  reason: actual and formal argument lists differ in length
2 errors
*/