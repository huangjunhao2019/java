public class AbstractDemo{
	public static void main(String[] args){
		AbstractSalary s=new AbstractSalary("Mohd","Ambehata, UP", 3,3600);
		AbstractEmployee e=new AbstractSalary("John Adams", "Boston, MA",2,2400.0);

		System.out.println("Call mailCheck using Salary reference--");
		s.mailCheck();

		System.out.println("Call mailCheck using Employee reference--");
		e.mailCheck();
	}
}
