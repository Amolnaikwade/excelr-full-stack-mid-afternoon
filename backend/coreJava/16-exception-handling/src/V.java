class V 
{
	public static void main(String[] args) 
	{
		try{
		System.out.println("main begin");
		int [] x = new int[99999999];
		System.out.println("try end");
		}
		catch(OutOfMemoryError ex)
		{
			System.out.println("from catch");
		}
		System.out.println("end of main");
	}
}
/*
main begin
try end
end of main

*/