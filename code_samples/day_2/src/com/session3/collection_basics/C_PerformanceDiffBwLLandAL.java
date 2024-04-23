package com.session3.collection_basics;
import java.util.*;
public class C_PerformanceDiffBwLLandAL {
	
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new LinkedList<>();
		doTiming(list2);
		
	}

	//time taken: 2111 ms for ArrayList
	//time taken: 11 ms for LinkedList
	private static void doTiming(List<Integer> list) {
		for(int i=0;i<1E5; i++) {
			list.add(i);
		}
		long start=System.currentTimeMillis();
		
		for(int i=0;i<1E5; i++) {
			list.add(0,i);
		}
		
		long end=System.currentTimeMillis();
		System.out.println("time taken: "+(end-start)+" ms");
	}

}
