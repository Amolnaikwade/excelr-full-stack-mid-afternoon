class h
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			if(i >= 3)
			{
			continue;
			continue;//unreachable statement;
			}
			System.out.println(i);
		}
	}
}
