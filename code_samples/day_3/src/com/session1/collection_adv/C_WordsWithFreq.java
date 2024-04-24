package com.session1.collection_adv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class C_WordsWithFreq {
	public static void main(String[] args) {
		
		//word along with the feq
		Map<String, Integer> words=new TreeMap<>();
		
		try(BufferedReader br=new BufferedReader(new FileReader("demo.txt"))){
			String line=null;
			while((line=br.readLine())!=null){
				//i need to make token of each line
				String tokens[]=line.split(" ");
				
				for(String token: tokens) {
					token = token.toLowerCase();
					if(!words.containsKey(token)) {
						words.put(token, 1);
					}else {
						//word is alreay there in that case i need to increase the freq
						int val=words.get(token);
						words.put(token, ++val);
					}
				}
				
			}
			//now i just need to print that map
			Set<Entry<String, Integer>> entries=words.entrySet();
			for(Entry<String, Integer> entry: entries) {
				System.out.println(entry.getKey()+" appers "+ entry.getValue()+" times");
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
