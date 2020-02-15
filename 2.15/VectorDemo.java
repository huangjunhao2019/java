import java.util.*;
public class VectorDemo{
	public static void main(String[] args){
		Vector v=new Vector(3,2);
		System.out.println("Inital size: "+v.size());
		System.out.println("Inital capacity: "+v.capacity());
		for(int i=1;i<5;i++){
			v.addElement(new Integer(i));
		}
		System.out.println("Capacity after four additions: "+v.capacity());
		v.addElement(new Double(5.45));
		System.out.println("Current capacity: "+v.capacity());
		v.addElement(new Double(6.08));
		v.addElement(new Integer(7));
		System.out.println("Current capacity: "+v.capacity());
		v.addElement(new Integer(11));
		v.addElement(new Integer(12));
		System.out.println("First element: "+(Integer)v.firstElement());
		System.out.println("Last element:"+v.lastElement());
		if(v.contains(new Integer(3)))
				System.out.println("Vector contains 3");
		Enumeration vEnum=v.elements();
		System.out.println("\n Elements in vector:");
		while(vEnum.hasMoreElements())
		System.out.print(vEnum.nextElement()+" ");
		System.out.print("\n");
	}
}

