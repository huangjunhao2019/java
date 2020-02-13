import java.util.*;
public class SortArray{
	public static void main(String[] args){
		int[] a=new int[10];
	        Scanner scan = new Scanner(System.in);
		for(int i=0;i<10;i++)
			a[i]=scan.nextInt();
		Arrays.sort(a);
		for(int element:a)
			System.out.println(element);
		scan.close();
	}
}
