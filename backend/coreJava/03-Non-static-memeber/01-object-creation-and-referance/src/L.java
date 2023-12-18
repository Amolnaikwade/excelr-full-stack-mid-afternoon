class L
{
	int i;
	
	static 
	{
		L l1 = new L();
		
		System.out.println(l1.i);
	}
}
/*
error: Main method not found in class L, 
please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend 
javafx.application.Application
*/