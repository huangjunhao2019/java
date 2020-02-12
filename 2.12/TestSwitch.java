public class TestSwitch{
	public static void main(String[] args){
		char grade='C';
		switch(grade){
			case 'A':
				System.out.println("Excellent");
				break;
			case 'B':
			case 'C':
				System.out.println("Good");
				break;
			case 'D':
				System.out.println("Ok");
				break;
			case 'F':
				System.out.println("Fighting");
			default:
				System.out.println("Unknow grade");
		}
		System.out.println("Your level is  "+grade);
	}
}
