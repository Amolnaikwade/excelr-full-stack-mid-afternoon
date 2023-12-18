class B 
{
	B()
	{
			System.out.println("B()");

	}
	{
	System.out.println("IIB");
	}
	B(int i)
	{
			System.out.println("B(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
			B b1 = new B();
			System.out.println("----------");
			B b2 = new B(10);
			System.out.println("----------");

	}
}
/*
C:\Users\HP\Desktop\Excelr\ExclermeetAfternon\backend\coreJava\03-Non-static-memeber\03-instance-initaliztion-block\src>java -cp ../classes B
Hello World!
IIB
B()
----------
IIB
B(int)
----------
*/