class S
{
	static 	
	{
			System.out.println("SIB-s" );
	}
	public static void main(String[] args) 
	{
		System.out.println("s-main");
		
	}
}
	class T
	{
		static
	{
	System.out.println("sib-t");
	}
	public static void main(String[] args)
		{
		System.out.println("T-main-begin");
		S.main(null);
		S.main(args);
		System.out.println("T-main-end");
	}
}
/*
  
sib-t
T-main-begin
SIB-s
s-main
s-main
T-main-end
 */                                           