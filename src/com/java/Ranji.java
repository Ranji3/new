package com.java;

public class Ranji {

	public static void main(String[] args) {
          
		int count1=0;
		int count2=0;
		
		
		
	   for (int i =1;i<=10; i++) {
		
	
		if (i%2==0) {
			System.out.println("even :"+i); 
			count1 =count1+i;
			
		}else {
			System.out.println("odd :"+i);
			count2=count2+i;
		}
		
	   }
		System.out.println(count1);
		System.out.println(count2);
		
		
	}

}
