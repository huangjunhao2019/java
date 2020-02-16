import java.util.*;
public class VectorTest{
	public static void main(String[] args){
		Vector<String> v=new Vector<String>();
		for(int i=0;i<10;i++){
			v.add(Integer.toString(i));
		}
		Iterator<String> ite=v.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}
}
