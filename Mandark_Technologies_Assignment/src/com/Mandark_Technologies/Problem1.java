package com.Mandark_Technologies;

//Problem 1 - Swapping Min Max

public class Problem1 {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 6, 5, 1, 2};
		int[] arr2 = {3, 4, 3, 2, 2, 5};
		
		int ans = swappingMinMax(arr1,arr2);
		System.out.println(ans);

	}
	
	
	public static int swappingMinMax(int[] arr1, int[] arr2) {
		
		int n = arr1.length;
		
		for(int i=1; i<n; i++) {
			if((arr1[i] < arr2[i]) && arr1[i] != 1) {
				swap(arr1,arr2,i);
			}
		}
		
		int a1 = findMax(arr1);
		int a2 = findMax(arr2);
		
		return a1*a2;
	}
	
	
	public static void swap(int[] arr1, int[] arr2, int i) {
		int temp = arr1[i];
		arr1[i]=arr2[i];
		arr2[i]=temp;
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
