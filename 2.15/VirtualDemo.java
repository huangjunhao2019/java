public class VirtualDemo{
	public static void main(String[] args){
		Salary s=new Salary("A","Beijing",3,3600);
		Employee e=new Salary("B","Shanghai",2,2400);
		System.out.println("Use the index of Salary to use mailcheck--");
		s.mailCheck();
		System.out.println("Use the index of Employee to use mailCheck--");
		e.mailCheck();
	}
}
