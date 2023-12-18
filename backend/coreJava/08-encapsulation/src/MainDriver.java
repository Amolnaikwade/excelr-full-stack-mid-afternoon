class  Emp
{
	private int EmpId;
	private String EmpName;
	private String EmpDep;
	private int empAge;
	private double empSal;

Emp(int EmpId,String EmpName,String EmpDep,int empAge,double empSal)
{
	this.EmpId=EmpId;
	this.EmpName=EmpName;
	this.EmpDep=EmpDep;
	this.empAge=empAge;
	this.empSal=empSal;

}
	public int getEmpId()
{
	return EmpId;
}
public void setEmpId(int EmpId)
{
	this.EmpId = EmpId;
}
public String getEmpName()
{
	return EmpName;
}
public void setEmpName(String EmpName)
{
	this.EmpName = EmpName;
}
public String getEmpDep()
{
	return EmpDep;
}
public void setEmpDep(String EmpDep)
{
	this.EmpDep = EmpDep;
}
public int getempAge()
{
	return empAge;
}
public void setempAge(int empAge)
{
	this.empAge = empAge;
}
public double getempSal()
{
	return empSal;
}
public void setempSal(double EmpSal)
{
	this.empSal = EmpSal;
}

}
class MainDriver
{

	public static void main(String[] args) 
	{
        Emp emp1 = new Emp(101,"Amol","full-stack",23,2200.0);
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpDep());
		System.out.println(emp1.getempAge());
		System.out.println(emp1.getempSal());
		System.out.println("--------------------");
		emp1.setEmpId(1001);
		emp1.setEmpName("john");
		emp1.setEmpDep("Datascience");
		emp1.setempAge(34);
		emp1.setempSal(3000.0);
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpDep());
		System.out.println(emp1.getempAge());
		System.out.println(emp1.getempSal());
	}
}
