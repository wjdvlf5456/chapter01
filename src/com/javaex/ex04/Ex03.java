package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		
		System.out.print("단 : ");
		int num = sc.nextInt();
		
		for	(int i = 1;i<10;i++) {							// --> (초기값;조건문;증감식)
			System.out.println(num+" * "+i+" = "+num*i);
			
		}
		
		sc.close();
	}

}
