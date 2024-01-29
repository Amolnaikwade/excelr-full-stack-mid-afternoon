public class W
{
	static void test(String...varArg)
	{ 
		//by default var-arg is an array
		//iterating an array by using for-each loop
		/*

		int i=0;
		for(String s1 : varArg)
		{
			
			if(s1 == null )
			{

				System.out.print(s1 );
				

				
			}
			else{
			System.out.print(s1);
			
			}
		
		if(++i < varArg.length)
		{
			System.out.print(",");
		}
		}
			System.out.println();
		
	}
	*/
	if(varArg.length == 0)
			{
			System.out.println("no element");

			}
	int counter = 0;
	for(String s1 : varArg)
		{
		counter++;
		System.out.print(s1);
		if(counter< varArg.length)
			{
			System.out.print(",");
			}
			
		}
		if(!(varArg.length == 0))
			{
			System.out.println();

			}
		}

	public static void main(String [] args)
	{
		test();
		test("abc");
		test("hello","test");
		test("hello","test","xyz");
		test("hello","test","xyz","abc");
	}
}
