package com.java;

public class Array {
	public static void main(String[] args) {
		
int arr[]=new int[]{1,5,9,8};
System.out.println(arr.length);
for (int i = 0; i < arr.length; i++) {
	for (int j = i+1; j < arr.length; j++) {
		if (arr[i]==arr[j]) 
			
			System.out.println(arr[i]);
		
		
	
	}
}

	}

}
