import java.util.*;
public class TestArray{
	public static void main(String[] args){
		int[] a=new int[100];
		for(int i=0;i<100;i++)
			a[i]=(int)(Math.random()*100+1);
		Arrays.sort(a);
		for(int element:a){
			System.out.println("\t"+element);
		}
	}
}

