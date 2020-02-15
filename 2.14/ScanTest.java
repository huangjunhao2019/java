import java.util.*;
public class ScanTest{
	public static void main(String[] args){
		int[] a=new int[10];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);
		for(int element:a){
			System.out.println(element);
		}
	}
}

