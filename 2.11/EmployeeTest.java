//import java.io.*;
public class EmployeeTest{
	public static void main(String[] args){
		Employee empOne=new Employee("RUNOOB1");
		Employee empTwo=new Employee("RUNOOB2");

		empOne.empAge(26);
		empOne.empDesignation("High programmer");
		empOne.empSalary(1000);
		empOne.printEmployee();

		empTwo.empAge(21);
		empTwo.empDesignation("Low programmer");
		empTwo.empSalary(500);
		empTwo.printEmployee();
	}
}
