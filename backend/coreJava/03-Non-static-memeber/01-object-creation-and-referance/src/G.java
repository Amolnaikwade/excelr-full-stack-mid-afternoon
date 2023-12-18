class G 
{
	void test()
	{
	}
	static
	{
		test();
	}
}
/*
  error: non-static method test() 
  cannot be referenced from a static context
                test();
                ^
  */