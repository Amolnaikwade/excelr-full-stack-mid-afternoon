abstract class CarDriver 
{
	public void howToDriveACar()
	{
		System.out.println("I goat a licence,and Know how to drive");
	}
	abstract void technicalDetails();
	
		
}


class  Car extends CarDriver 
{
	void technicalDetails()
	{
		System.out.println("technical things,engine,tpmd,aorvm,HillHoldAssist,ADAS");
	}
	public static void main(String[] args) 
	{
		Car safari = new Car();
		safari.howToDriveACar();
		safari.technicalDetails();
		System.out.println("done");
	}
}
