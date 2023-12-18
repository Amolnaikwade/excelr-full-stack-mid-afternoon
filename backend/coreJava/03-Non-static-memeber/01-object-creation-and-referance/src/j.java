class J
{
	int x;
	 static void test() 
	{
		J ref = new J();
		System.out.println(ref.x);
	}
}
/*
Error: Main method not found in class J, 
please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend 
javafx.application.Application
*/