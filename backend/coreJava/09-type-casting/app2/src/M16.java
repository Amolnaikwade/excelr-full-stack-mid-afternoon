class M16 
{
static C test()
{
A a1 = new D();
return a1;

}
	public static void main(String[] args) 
	{
D d1 = test();
		System.out.println("done");
	}
}
// error: incompatible types: A cannot be converted to C
//return a1;
       ^
//M16.java:11: error: incompatible types: C cannot be converted to D
//D d1 = test();