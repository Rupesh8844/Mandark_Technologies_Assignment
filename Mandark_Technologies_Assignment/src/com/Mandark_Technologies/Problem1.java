package com.Mandark_Technologies;

//Problem 1 - Swapping Min Max

public class Problem1 {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 6, 5, 1, 2};
		int[] b = {3, 4, 3, 2, 2, 5};
		
		int ans = minmax(a,b);
		System.out.println(ans);

	}
	
	
	public static int minmax(int[] a, int[] b) {
		
		int n = a.length;
		
		for(int i=1; i<n; i++) {
			if((a[i] < b[i]) && a[i] != 1) {
				swap(a,b,i);
			}
		}
		
		int a1 = findMax(a);
		int b1 = findMax(b);
		
		return a1*b1;
	}
	
	
	public static void swap(int[] a, int[] b, int i) {
		int temp = a[i];
		a[i]=b[i];
		b[i]=temp;
	}
	
	
	public static int findMax(int[] arr) {
		int max  = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	

}
