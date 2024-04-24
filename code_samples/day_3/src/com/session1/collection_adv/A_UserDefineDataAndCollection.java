package com.session1.collection_adv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A_UserDefineDataAndCollection {
	
	public static void main(String[] args) {
		
		List<Emp> list=new ArrayList<Emp>();
		
		list.add(new Emp(1, "ravi", 5000));
		list.add(new Emp(16, "john", 5900));
		list.add(new Emp(109, "ekta", 7000));
		list.add(new Emp(41, "tarun", 5000));
		list.add(new Emp(90, "raj", 8000));
		
		System.out.println("-----------original data----------");
		for(Emp e: list) {
			System.out.println(e);
		}
		//i need to sort them
		Collections.sort(list);
		
		System.out.println("------------after sorting as per id--------");
		for(Emp e: list) {
			System.out.println(e);
		}
		
		System.out.println("------------after sorting as per name--------");
		Collections.sort(list, new EmpNameSorter());
		for(Emp e: list) {
			System.out.println(e);
		}
		
		
		System.out.println("------------after sorting as per salary--------");
		Collections.sort(list, new SalarySorter());
		for(Emp e: list) {
			System.out.println(e);
		}
	}

}
