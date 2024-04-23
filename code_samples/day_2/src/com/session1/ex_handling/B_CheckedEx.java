package com.session1.ex_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class B_CheckedEx {

//	public static void main(String[] args) throws FileNotFoundException {
//		//IO
//		BufferedReader br=new BufferedReader(new FileReader("demo1.txt"));
//	}

	public static void main(String[] args) {
		// IO
//		BufferedReader br=null;
//		try {
//			br = new BufferedReader(new FileReader("demo.txt"));
//			String line = null;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println(e.getMessage());
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			try {
//				br.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

		try (BufferedReader br = new BufferedReader(new FileReader("demo.txt"))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
















