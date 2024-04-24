package com.session1.intro_generics;
import java.util.*;

import com.session1.collection_adv.Emp;
public class A_DemoGenerics {
	
	public static void main(String[] args) {
		List<String> list = getData();
		//when u want to retrive it?
//		
//		Integer val=(Integer) list.get(0);
//		System.out.println(val);//ClassCastException
		
		//the purpose of generics is to provide type safty?
		String val=list.get(0);
		System.out.println(val);
		
	}

	
	
	
	
	
	private static List<String> getData() {
		List<String> l=new ArrayList<>();
		l.add("foo");
		l.add("raj");
		return l;
	}
	
	
//	private static List getData() {
//		List l=new ArrayList();
//		l.add("foo");
//		l.add(4);
//		l.add(new Emp(1, "raj", 4000));
//		return l;
//	}

}
