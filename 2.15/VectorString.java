import java.util.*;
public class VectorString{
	public static void main(String[] args){
		Vector v=new Vector();
		Scanner scan= new Scanner(System.in);
		while(scan.hasNextInt()){
			int temp=scan.nextInt();
			System.out.println(temp);

		/*	if(temp==new String("end"))
		{
				System.out.println("ok");
				break;
			}*/
			v.addElement(new Integer(temp));
		}
		System.out.println("Input end");
		for(int i=0;i<v.size();i++){
			System.out.println(v.get(i));
		}
	}
}
