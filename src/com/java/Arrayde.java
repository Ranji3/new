package com.java;

import java.util.Arrays;

public class Arrayde {

	public static void main(String[] args) {

		
		//int[] arr= {12,34,56,78,92,36,56};
	//	Arrays.sort(arr);
	//	System.out.println(Arrays.toString(arr));
		int a[] = new int[] {10,20,65,25,5,89};
		System.out.println(a.length);
		
		System.out.println(Arrays.toString(a));
//		                         6-1 = 5
		for (int i = 0; i < a.length-1; i++) {
//			                       5
			for (int j = 0; j < a.length-1; j++) {
				
				if (a[j]>a[j+1]) {
					
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
				
			}
			
		}
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
		
		
	}

}
