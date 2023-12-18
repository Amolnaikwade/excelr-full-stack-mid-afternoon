class E
{
	
	 void test1() 
	{
		System.out.println("from test 1");
	}
	 static void test2() 
	{
		System.out.println("from test2");
	}
}
/*
 Error: Main method not found in class E, please 
 define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend
javafx.application.Application
                                   ^
								   */