import java.util.Scanner;
public class ScannerDemoAve{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		double sum=0;
		int m=0;
		while(scan.hasNextDouble()){
			double x=scan.nextDouble();
			m=m+1;
			sum=sum+x;
		}
		System.out.println(m+" numbers summary is "+sum);
		System.out.println(m+" numbers average is "+(sum/m));
		scan.close();
	}
}
