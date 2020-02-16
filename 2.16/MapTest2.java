import java.util.*;
public class MapTest2{
	public static void main(String[] args){
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(20163243,"HUANG Jun-Hao");
		map.put(20163244,"WANG Bo");
		for(Map.Entry<Integer,String> entry:map.entrySet()){
			System.out.println("key="+entry.getKey()+" and value= "+entry.getValue());
		}
	}
}
