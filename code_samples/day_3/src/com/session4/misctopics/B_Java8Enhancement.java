package com.session4.misctopics;
import java.util.*;
//declartive data processing, 
import java.util.function.Function;

public class B_Java8Enhancement {

	public static void main(String[] args) {
		List<Emp> emps=new ArrayList<>();
		emps.add(new Emp(91, "ravi", 4900));
		emps.add(new Emp(109, "raj", 9700));
		emps.add(new Emp(10, "ekta", 9000));
		
//		Collections.sort(emps, new Comparator<Emp>() {
//
//			@Override
//			public int compare(Emp o1, Emp o2) {
//				return Double.compare(o2.getSalary(), o1.getSalary());
//			}
//		});
//		
//		List<String> names=new ArrayList<>();
//		for(Emp e: emps) {
//			names.add(e.getName());
//		}
//		
//		for(String name: names) {
//			System.out.println(name);
//		}
		
		
//		emps.stream()
//		.sorted((Emp o1, Emp o2)->  Double.compare(o2.getSalary(), o1.getSalary()))
//		.map(e-> e.getName())
//		.forEach(name-> System.out.println(name));
		
		
		//SQL
		
		emps.stream()
		.sorted(Comparator.comparing(Emp::getSalary).reversed())
		.map(Emp::getName)
		.forEach(name-> System.out.println(name));
		
		
		
		
		
		
		
	}
}
