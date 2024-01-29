class R
{
    final int i;

    R()
    {
       i = 20;
    }
	R(int j, int k)
	{
		i=10;
	}
}
/*
 error: variable i might not have been initialized
        }
        ^
1 error
*/