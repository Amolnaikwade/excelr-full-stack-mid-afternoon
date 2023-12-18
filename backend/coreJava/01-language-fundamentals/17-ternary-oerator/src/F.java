class F
{
	public static void main(String[] args) 
	{
		
	int firstNum = 10;
	int secondNum = 20;
	int thirdNum = 2;
	int min = ((firstNum < secondNum) ?  ((firstNum < thirdNum) ? firstNum:thirdNum) : ((secondNum<thirdNum)?secondNum:thirdNum));
		System.out.println("Minimum b/n" + firstNum + "and"+secondNum+"and"+ thirdNum + "is"+ min );
	}
}


