package com.Mandark_Technologies.Problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Problem3 {

	public static void main(String[] args) {
		
	try {
		
				List<String> list = new ArrayList<>();
		
				Scanner sc = new Scanner(System.in);
				
				System.out.println("please enter unique strings which is combination of letter and number by separated comma like:- "
						+ "  d34,g54,d12,b87,g1,c65,g40,g5,d77  without giving extra space.");
				String str = sc.nextLine();
				
			   String[] st = str.split(",");
			   
			   for(String s : st) {
				   list.add(s);
			   }
		
		//		solution for L1 where I am just comparing the first  char of all string"
			   Collections.sort(list,(str1,str2)-> str1.charAt(0) - str2.charAt(0));
			   
			   System.out.print("L1 :");
			   for(int i=0;i<list.size();i++) {
				   if(i != list.size()-1) {
					   System.out.print(" "+list.get(i)+",");
				   }else {
					   System.out.print(" "+list.get(i));
				   }
			   }
			   
			   
			   
			   System.out.println();
			   
			   
		//	  solution for L2
			   Collections.sort(list,new MyComp());
			   
			   System.out.print("L2 :");	   
			   for(int i=0;i<list.size();i++) {
				   if(i != list.size()-1) {
					   System.out.print(" "+list.get(i)+",");
				   }else {
					   System.out.print(" "+list.get(i));
				   }
			   }
				
	} catch (Exception e) {
		System.out.println("Please enter the data in correct format...");
	}
	   
	   
		
	}

}
