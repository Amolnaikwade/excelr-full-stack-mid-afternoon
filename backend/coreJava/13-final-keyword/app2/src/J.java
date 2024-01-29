class j 
{
	static final int i = 5;
	static
	{
		i = 10;
	}
}
/*
error: cannot assign a value to final variable i
                i = 10;
                ^
1 error
*/