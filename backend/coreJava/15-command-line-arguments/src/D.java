class D 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1 = args[0];
		System.out.println("------0------");
		String s2 = args[1];
		System.out.println("------1------");
		System.out.println("main end");
	}
}
/*
C:\Users\HP\Desktop\Excelr\ExclermeetAfternon\backend\coreJava\15-command-line-arguments\src>javac -d ../classes d.java

C:\Users\HP\Desktop\Excelr\ExclermeetAfternon\backend\coreJava\15-command-line-arguments\src>java -cp ../classes D amol naikwade
main begin
------0------
------1------
main end
*/
