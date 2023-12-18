class F
{
	public static void main(String[] args) 
	{
		
		int i = 0;
		do
		{
		System.out.println("begin:"+i);
		i++;
		if(i > 3)
		{
			break;
		}
		System.out.println("end:" +i);
	}
	while (i < 10);
	
	}
}

/*i=0,1,2,3
begin:0
end:1
begin:1
end:2
begin:2
end:3
begin:3
*/