import java.util.*;
public class MapTest{
	public static void main(String[] args){
		Map<String,String> map=new HashMap<String,String>();
		map.put("1","value1");
		map.put("2","value2");
		map.put("3","value3");

		//First
		System.out.println("Through Map.keySet to go throught key and value");
		for(String key: map.keySet()){
			System.out.println("key="+key+" and value="+map.get(key));
		}
		//Second
		System.out.println("Through Map.entrySet using iterator to go through key and value");
		Iterator<Map.Entry<String,String>> it=map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String,String> entry=it.next();
			System.out.println("key= "+entry.getKey()+" and value="+entry.getValue());
		}
		//Third
		System.out.println("Through Map.entrySet to go through key and value");
		for(Map.Entry<String,String> entry:map.entrySet()){
			System.out.println("key="+entry.getKey()+" and value="+entry.getValue());
		}
		//Fourth
		System.out.println("Through Map.values() to go through all values, but do not include key");
		for(String v:map.values()){
			System.out.println("value="+v);
		}
	}
}
