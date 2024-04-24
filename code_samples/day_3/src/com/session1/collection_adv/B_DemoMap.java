package com.session1.collection_adv;
import java.util.*;
import java.util.Map.Entry;
public class B_DemoMap {
	
	public static void main(String[] args) {
		Map<String, Integer> maps=new HashMap<>();
		maps.put("raj", 89);
		maps.put("raj", 99);
		maps.put("poul", 99);
		maps.put("ekta", 79);
		maps.put("john", 90);
		
		//System.out.println(maps);
		
		//print one by one keyset and entryset
		System.out.println("using keyset");
		Set<String> keys=maps.keySet();// hey java give me all unique keys of this map
		for(String key: keys) {
			System.out.println(key+": "+ maps.get(key));
		}
		//entryset
		System.out.println("using entryset");
 		Set<Entry<String, Integer>>entries=maps.entrySet();
 		
 		for(Entry<String, Integer> e: entries) {
 			System.out.println(e.getKey()+" : "+e.getValue());
 		}
 		
		
		
		
		
		
		
//		Map<String, Integer> maps=new LinkedHashMap<>();
//		maps.put("raj", 89);
//		maps.put("raj", 99);
//		maps.put("poul", 99);
//		maps.put("ekta", 79);
//		maps.put("john", 90);
//		
//		//System.out.println(maps);
//		
//		//print one by one keyset and entryset
//		Set<String> keys=maps.keySet();// hey java give me all unique keys of this map
//		for(String key: keys) {
//			System.out.println(key+": "+ maps.get(key));
//		}
		
//		Map<String, Integer> maps=new TreeMap<>();
//		maps.put("raj", 89);
//		maps.put("raj", 99);
//		maps.put("poul", 99);
//		maps.put("ekta", 79);
//		maps.put("john", 90);
//		
//		//System.out.println(maps);
//		
//		//print one by one keyset and entryset
//		Set<String> keys=maps.keySet();// hey java give me all unique keys of this map
//		for(String key: keys) {
//			System.out.println(key+": "+ maps.get(key));
//		}
		
	}

}
