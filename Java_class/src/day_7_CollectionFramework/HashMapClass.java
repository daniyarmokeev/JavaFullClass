package day_7_CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class HashMapClass {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		
		map.put("myname", "mike");
		map.put("myjob", "developer");
		map.put("myAge", "23");
		
		//System.out.println(map);
		//System.out.println(map.get("myname"));
		
		Set<String> keys = map.keySet();
		
		for(String key: keys) {
			System.out.println(map.get(key));
		}
		
		
	}

}



