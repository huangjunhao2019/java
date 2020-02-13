public class TestPassByValue{
 	public static void swap(int n1,int n2){
		System.out.println("\t Enter swap method");
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("\t After swap method"+"n1="+n1+", +n2="+n2);
	}
	public static void main(String[] args){
		int num1=1;
		int num2=2;
		System.out.println("\t Before swap method, n1="+num1+", n2="+num2);
		swap(num1,num2);
		System.out.println("\t After swap method,(int main) n1="+num1+", n2="+num2);
	}
}
