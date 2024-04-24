package com.session1.collection_basics_recap;
import java.util.*;// collection api
/*
 * 		List: allow duplicate
			LinkList Vector ArrayList
			PriorityQueue
 */
public class B_HelloWorldLinkList {
	
	public static void main(String[] args) {
		//loose coupling
//		Vehicle v=new Car();
//		Car c=new Car();
		
		//<String> it is called generics : type safty to ur data?
		List<String> list=new LinkedList<String>();
		list.add("foo");
		list.add("ravi");
		list.add("ekta");
		list.add("paul");
		list.add("john");
		list.add("mohit");
		
		System.out.println(list);
		//sort them
		Collections.sort(list);//how to custom sort?
		
		System.out.println("sorted list");
		System.out.println(list);
		
		//binary search
		int index=Collections.binarySearch(list, "umesh");
		System.out.println(index);
		
		//print the data one by one
//		for(String d: list) {
//			System.out.println(d);
//		}
//		
		//iterator : used to iterate the list
//		Iterator<String> it=list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			it.remove();
//		}
//		System.out.println(list);
		//list.add(3);
	}

}
