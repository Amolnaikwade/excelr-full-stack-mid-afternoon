class Dog 
{
	String name,breed,gender,color;
	int age;
	double height,weight;
	Dog( String dogName, String dogBreed, String dogGender, String dogColor, int dogAge, double dogHeight, double dogWeight)
		{
			System.out.println("intializing dog object begins");
			name = dogName;
			breed = dogBreed;
			gender = dogGender;
			color = dogColor;
			age = dogAge;
			height = dogHeight;
			weight = dogWeight;
			System.out.println("intializing dog object: completed");

	}

	//behaviours
	void bark()
	{
		System.out.println("This dog barks");
	}
	void bite()
	{
		System.out.println("This dog bits");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		Dog d1 = new Dog("charlie","lab","male","brown",2,2.8,5.8);
		Dog d2 = new Dog("Pinky","lab","female","white",2,2.8,5.8);
		System.out.println(" Name: " + d1.name + " Breed: " + d1.breed + " Gender: "+ d1.gender + " color: " + d1.color + " Age: " + d1.age + " Height: " + d1.height + " Weight" + d1.weight);
		d1.bite();
		System.out.println("****************************");
		
		System.out.println("Name: " + d2.name + " Breed: " + d2.breed + " Gender: "+ d2.gender + " color: " + d2.color + " Age: " + d2.age + " Height: " + d2.height + " Weight" + d2.weight);
		d2.bark();
		System.out.println("main end");
	}
}
/*
main begin
intializing dog object begins
intializing dog object: completed
intializing dog object begins
intializing dog object: completed
 Name: charlie Breed: lab Gender: male color: brown Age: 2 Height: 2.8 Weight5.8
This dog bits
****************************
Name: Pinky Breed: lab Gender: female color: white Age: 2 Height: 2.8 Weight5.8
This dog barks
main end
*/