package com.Mandark_Technologies;

import java.util.Scanner;

//Problem 5 - Perfect Number


public class Problem5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		//reads a number from the user 
		long number = s.nextLong();
		
		//calling the function
		boolean ans = isPerfect(number);
		
		//printing the result
		if(ans) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}
	
	
	public static boolean isPerfect(long number) {
		
		long sum=0;
		
		for(int i=1; i<= number/2; i++) {
			if(number%i == 0) {
				sum+=i;
			}
		}
		
		if(sum == number) {
			return true;
		}else {
			return false;
		}
		
	}

}
