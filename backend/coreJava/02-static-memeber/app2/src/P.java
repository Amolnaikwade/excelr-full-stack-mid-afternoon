class O
{
	static int i=100;
		public static void main(String[] args) 
	{
			System.out.println("from O test: " + P.i);
	}
}
class P

{
	static int i=200;
	public static void main(String[] args) 
	{
		System.out.println("from G main: " + O.i);
		
	}
}
/*
  
from G main: 100

 */                                           