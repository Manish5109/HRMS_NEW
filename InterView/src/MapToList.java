import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapToList {
	public static void main(String args[]){
		Map <Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(5, "six");
//		for(Map.Entry m : map.entrySet()){
//			System.out.println("key ="+m.getKey()+"|| value = "+m.getValue());
//		}
		
//		Set<Integer> keyset = map.keySet();
//		List<Integer> keyList = new  ArrayList<Integer>(keyset);
		
//		Iterator<Integer> it = keyList.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
//		
		//Collection<String> value = map.values();
		
		map.values().stream().distinct();
		
		List<String> valueList = new ArrayList<String>(map.values());
		
		Set<Entry<Integer,String>> set = map.entrySet();
		List<Entry<Integer, String>> lst = new ArrayList<>(set);
		Iterator<Entry<Integer,String>> itr = lst.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
