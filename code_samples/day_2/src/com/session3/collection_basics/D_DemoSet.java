package com.session3.collection_basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class D_DemoSet {
	
	public static void main(String[] args) {
//		Set<Integer> set=new HashSet<>();
//		set.add(3);
//		set.add(3);
//		set.add(38);
//		set.add(63);
//		set.add(23);
//		//HashSet: neighter sorted nor ordered
//		System.out.println(set);
		
		
//		Set<Integer> set=new LinkedHashSet<>();
//		set.add(3);
//		set.add(3);
//		set.add(38);
//		set.add(63);
//		set.add(23);
//		//LinkedHashSet:maintain the insertion ordered
//		System.out.println(set);
	
		Set<Integer> set=new TreeSet<>();
		set.add(3);
		set.add(3);
		set.add(38);
		set.add(63);
		set.add(23);
		//TreeSet:give us sorted data
		System.out.println(set);
		
		
	}

}
