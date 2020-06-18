class Employee extends Person{
	double salary;
	int year;
	String insuranceId;
	public Employee(String name,double salary,int year,String insuranceId){
		super(name);
		this.salary=salary;
		this.year=year;
		this.insuranceId=insuranceId;
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year=year;
	}
	public String getInsuranceId(){
		return insuranceId;
	}
	public void setName(String insuranceId){
		this.insuranceId=insuranceId;
	}
	public void display(){
		//Super.display();
		System.out.println("Name: "+getName()+"\nSalary: "+getSalary()+"\nJoining year: "+getYear()+"\nInsurance Id: "+getInsuranceId());
	}
}