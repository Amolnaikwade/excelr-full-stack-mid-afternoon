import java.io.FileReader;

class Q
{
	public static void main(String[] args) 
	{
		FileReader fileReader = new FileReader("");
	}
}
/*
q.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
                FileReader fileReader = new FileReader("");
                                        ^
1 error
*/