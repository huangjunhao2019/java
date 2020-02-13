import java.util.Scanner;
public class ScannerDemoNL{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("NextLine method input:");
		if(scan.hasNextLine()){
			String str2=scan.nextLine();
			System.out.println("The input data is "+str2);
		}
		scan.close();
	}
}
