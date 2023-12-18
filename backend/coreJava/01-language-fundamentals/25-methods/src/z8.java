class z8
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100,200,300,10f,20.0,'a',true,"hello");
		System.out.println("main end");
			 
		}
		static void test(byte b, short s,int i, float j,double k, char ch, boolean , String str)
	{
				byte b =127;
				System.out.println("from test: " +b);
				System.out.println("from test: " +s);
				System.out.println("from test: " +i);
				System.out.println("from test: " +j);
				System.out.println("from test: " +k);
				System.out.println("from test: " +ch);
				System.out.println("from test: " +l);
				System.out.println("from test: " +str);
	}
}
/*


main begin
from test: 100
from test: 200
from test: 1000
from test: 2000
main end                       ^

*/