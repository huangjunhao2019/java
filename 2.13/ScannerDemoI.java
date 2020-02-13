import java.util.Scanner;
public class ScannerDemoI{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int i=0;
		float f=0.0f;
		System.out.print("Input an integel");
		if(scan.hasNextInt()){
			i=scan.nextInt();
			System.out.println("Integel is "+i);
		}
		else 
			System.out.println("Error");
		System.out.println("Input the float:");
		if(scan.hasNextFloat()){
			f=scan.nextFloat();
			System.out.println("The float is "+f);
		}
		else
			System.out.println("The input is not float!");
		scan.close();
	}
} 
