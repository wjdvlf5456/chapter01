package com.javaex.ex04;

public class Ex05 {
	
	public static void main(String[] args) {
		
		int product = 0;
		
		for (int i = 2; i <=9 ; i++) {
			
			for (int j = 1; j <=9; j++) {
				product = i*j;
				
				System.out.println(i+"*"+j+" = "+product);
			}
			
		}
		
	}

}
