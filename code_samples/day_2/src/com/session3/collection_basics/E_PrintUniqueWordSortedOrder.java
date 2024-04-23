package com.session3.collection_basics;
import java.util.*;
import java.io.*;
public class E_PrintUniqueWordSortedOrder {
	public static void main(String[] args) {
		//print word --- freq: HashMap
		//create a file and read each line
		//make token of that line and put into TreeSet
		//print the result
		Set<String> set=new TreeSet<>();
		try(BufferedReader br=new BufferedReader(new FileReader("demo.txt"))){
			String line=null;
			while((line=br.readLine())!=null){
				//i need to make token of each line
				String tokens[]=line.split(" ");
				for(String token: tokens) {
					set.add(token.toLowerCase());
				}
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("unique words in the file");
		for(String s: set) {
			System.out.println(s);
		}
	}

}
