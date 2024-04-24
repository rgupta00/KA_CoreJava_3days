package com.session1.collection_basics_recap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class G_UsingHashSetCorrectly {
	
	public static void main(String[] args) {
		//HashSet and HashMap : they use hashing concept internally
		Set<Emp> emps=new HashSet<>();
		emps.add(new Emp(1, "ravi", 7000));
		emps.add(new Emp(71, "tom", 7900));
		emps.add(new Emp(14, "john", 9000));
		
		//hey do u have ravi records?
		boolean status= emps.contains(new Emp(1, "ravi", 7000));
		System.out.println(status);
		
		
	}

}
