import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("next method to input");
		if(scan.hasNext()){
			String str1=scan.next();
			System.out.println("The input data is :"+str1);
		}
		scan.close();
	}
}
