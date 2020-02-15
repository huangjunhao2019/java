import java.util.*;
public class VectorDouble{
	public static void main(String[] args){
		Vector v=new Vector();
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextDouble()){
			double temp=scan.nextDouble();
		//	v.addElement(new Double(temp));
		        v.add(temp);
		}
	//	for(double element:v)
	//		System.out.print(element+" ");
	        double[] a=v.toArray();
		for(double element:a)
			System.out.println(element);
		System.out.print("\n");
	}
}
