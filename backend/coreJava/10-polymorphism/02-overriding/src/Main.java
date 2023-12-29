class Animal 
{
	void makeSound()
	{
		System.out.println("generic animal sound");
	}
}
class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Bark!");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("mewo!");
	}
}
class Main
{

	public static void main(String[] args) 
	{	
		Animal genericAnimal = new Animal();
		Animal dog = new Dog();
		Animal cat = new Cat();

		genericAnimal.makeSound();
		dog.makeSound();
		cat.makeSound();
		System.out.println("done!");
	}
}
/*
generic animal sound
Bark!
mewo!
done!
*/