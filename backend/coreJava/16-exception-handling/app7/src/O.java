import java.util.Scanner;
class O
{
	public static void main(String[] args) throws InsufficientBalanceException
	{
		System.out.println("Welcome to your Account");
		System.out.println("Your Balance is 10,000.0 Rupees");
		System.out.println("Enter the amount to be withdrawn");
		Scanner sc = new Scanner(System.in);
		int i;
		do
		{
			if(i<=0)
			{
				System.out.println("Invalid! please enter valid amount to be withdraw");
			}
		}
		while(equalsIgnoreCase("y"));
		if(i > 10000)
		{
			throw new InsufficientBalanceException("your balance is 10,000 only!");
		}
		System.out.println("10,000 cash despensed. count the cash before leaving");
		System.out.println("Thank you");
	}
}
/*
 we can create coustome exception classes.
 -yhe coustone execption class must be extenending throwable type exception throwable type
 -while extending coustome Exception class if you use Exception or throwable or any  any checkedException it will be treated as checked. so if you dont wamt to get use thows or handling mechnism then just go for any unchecked type execption type.
 */