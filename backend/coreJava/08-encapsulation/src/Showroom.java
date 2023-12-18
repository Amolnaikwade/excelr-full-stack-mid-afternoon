class  Car
{
	
	private String CarCompany;
	private String CarName;
	private String CarColor;
	private double CarPrice;

Car(String CarCompany,String CarName,String CarColour,Double CarPrice )
{
	this.CarCompany = CarCompany;
this.CarName = CarName;
this.CarColor = CarColor;
this.CarPrice = CarPrice;

}
	public String getCarCompany()
{
	return CarCompany;
}
public void setCarCompany(String CarCompany)
{
	this.CarCompany = CarCompany;
}
public String getCarName()
{
	return CarName;
}
public void setCarName(String CarName)
{
	this.CarName = CarName;
}
public String getCarColor()
{
	return CarColor;
}
public void setCarColor(String CarColor)
{
	this.CarColor = CarColor;

}
public double getCarPrice()
{
	return CarPrice;
}
public void setempSal(double CarPrice)
{
	this.CarPrice = CarPrice;
}

}
class Showroom
{

	public static void main(String[] args) 
	{
        Car emp1 = new Car("TATA","HARRIER","BLACK",220000.0);
		System.out.println(emp1.getCarCompany());
		System.out.println(emp1.getCarName());
		System.out.println(emp1.getCarColor());
		System.out.println(emp1.getCarPrice());
		System.out.println("--------------------");
		emp1.setCarCompany("TATA");
		emp1.setCarName("SAFARI");
		emp1.setCarColor("WHITE");
		
		System.out.println(emp1.getCarCompany());
		System.out.println(emp1.getCarName());
		System.out.println(emp1.getCarColor());
		
	
	}
}
