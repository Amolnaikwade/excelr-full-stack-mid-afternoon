class  D
{
	static int i;
	static int j;
	
	public static void main(String[] args) 
	{
	
		System.out.println(i);
		System.out.println(j);
		i = 10;//reinitailize 
		j = 20;
		System.out.println(i);
		System.out.println(j);
	}
}
/*
0
0
10
20
*/