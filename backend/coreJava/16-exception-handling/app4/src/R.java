import java.io.FileReader;
import java.io.IOException;
class R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			FileReader fileReader = new FileReader("");
		}
		catch (IOException ex)
		{
			System.out.println("from catch: " + ex);
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
/*
main begin
from catch: java.io.FileNotFoundException:  (No such file or directory)
java.io.FileNotFoundException:  (No such file or directory)
        at java.io.FileInputStream.open0(Native Method)
        at java.io.FileInputStream.open(Unknown Source)
        at java.io.FileInputStream.<init>(Unknown Source)
        at java.io.FileInputStream.<init>(Unknown Source)
        at java.io.FileReader.<init>(Unknown Source)
        at R.main(r.java:10)
main end
*/