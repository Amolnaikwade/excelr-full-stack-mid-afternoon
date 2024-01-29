class E 
{
	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = i + j;
		System.out.println("addituion of " + i + " and " + j + " is: " + k);
	}
}
/*
C:\Users\HP\Desktop\Excelr\ExclermeetAfternon\backend\coreJava\15-command-line-arguments\src>java -cp ../classes E 1 2
addituion of 1 and 2 is: 3


-parseInt ==> is going to convert the `int value` which is in the from of `string` to the `ptemitive int` value.
-parseInt method takes one String as the argument.
*/
