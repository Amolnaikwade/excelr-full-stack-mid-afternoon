class A 
{
	public static void main(String[] args) 
	{
		System.out.println("from main: "+ args.length);
	}
}
/*
from main: 0


command line arguments
-At the time of running a class or runnig a program we can supply some values as arument the main of a class that we are running.
-we can pass some argumet some prigram while runnig.
-by using that arguments we can perform some operations.
Ex: java -cp ../classes A abc xyz 123 test
-while runnig a class we must if we don't supply any arguments mai method then jvm is going to create empty String array object
-assume if we are suppling any arguments while runnig the class jvm is going to create a string array object with the suppled elements.
Ex:  java -cp ../classes A abc xyz 123 test
jvm ==> String[] {"abc","xyz", "123","test"}; 
then it would be supplied to main method args 'args = String[] {"abc","xyz", "123","test"}; ' 
-jvm can ony create single dimentional array by using command line arguments.

*/
