import java.util.Scanner;
class F
  
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a sentence!");
		String s1 = new Scanner(System.in).nextLine();
		try
		{
			System.out.println("try begin");
			int i= Integer.parseInt(s1);
			System.out.println("++++++++++");
			int k = i / 0;
			System.out.println(" try end");

		}
		catch (NumberFormatException | ArithmeticException ex)
		{
			System.out.println("from catch: " + ex);
		}
		
		System.out.println(" main end");
	}
}
/*

- if you want to handle multiple exception you can use this syntax.
-catch (NumberFormatException | ArithmeticException ex)
amol
try begin
from catch: java.lang.NumberFormatException: For input string: "amol"
 main end

C:\Users\HP\Desktop\Excelr\ExclermeetAfternon\backend\coreJava\16-exception-handling\app2\src>java -cp ../classes F
Enter a sentence!
22324
try begin
++++++++++
from catch: java.lang.ArithmeticException: / by zero
 main end
 
 */