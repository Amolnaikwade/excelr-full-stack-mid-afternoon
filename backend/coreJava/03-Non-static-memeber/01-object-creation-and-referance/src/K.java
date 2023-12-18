class K
{
	void test1()
	{
		
		System.out.println("from test1");
	}
	static void test2()
	{
		K obj = new K();
		obj.test1();
		System.out.println("from test2");
	}
}
/*
Error: Main method not found in class J, 
please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend 
javafx.application.Application
*/