class M
{
	void test1()
	{
			
		System.out.println("from test1");
	}
	
	static 
	{
		M obj = new M();
		obj.test1();
	
	}
}
/*
error: Main method not found in class L, 
please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend 
javafx.application.Application
*/