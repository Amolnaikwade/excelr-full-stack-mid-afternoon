class M 
{
	public static void main(String[] args) 
	{
		Class.forName("");
	}
}
/*

M.java:5: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
                Class.forName("");
                             ^]\\



-class.forName(""); ==> Load class
- class.forName("");==>handle class not found exception
*/
