public class Salary extends Employee{
	private double salary;
	public Salary(String name, String address,int number,double salary){
		super(name,address,number);
		setSalary(salary);
	}
	public void mailCheck(){
		System.out.println("The salary of mailCheck method");
		System.out.println("The check is mailed to "+getName()+", the salary is "+salary);
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double newSalary){
		if(newSalary>=0.0){
			salary=newSalary;
		}
	}
	public double computePay(){
		System.out.println("The pay is to "+getName());
		return salary/52;
	}
}
		
