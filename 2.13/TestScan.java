import java.util.Scanner;
public class TestScan{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
	        int sum=0;
		while(scan.hasNextDouble()){
			double x=scan.nextDouble();
			sum+=x;
		}
		scan.close();
		System.out.println("The summary is "+sum);
	}
}
