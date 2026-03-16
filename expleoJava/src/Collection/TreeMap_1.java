package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_1 {
	public static void main(String [] args) {
		TreeMap<String , Double> map = new TreeMap<String, Double>();
		System.out.println("size of hashmap "+map.size());
		map.put("jeeva", 20.1);
		map.put("tamil", 54.1);
		map.put("muhi", 12.8);
		map.put("rishwanth", 44.3);
		System.out.println("the Hashmap element are "+map);
		System.out.println("hashmap size after adding element : "+map.size());
		
		Set<Map.Entry<String, Double>> set = map.entrySet();
		
		for(Map.Entry<String, Double> me :set) {
			System.out.println(me.getKey()+" "+me.getValue());
		}
	}
}
