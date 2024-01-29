import java.sql.SQLException;
class Q 
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		try
		{
			
		}
		catch (SQLException ex)
		{
		}
		System.out.println("main end");
	}
}
/*
q.java:11: error: exception SQLException is never thrown in body of corresponding try statement
                catch (SQLException ex)
                ^
1 error
*/