package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		System.out.print("숫자: ");
		int numb = sc.nextInt();
		
		if (numb>0) {
			
			if (numb%2==0) {
				System.out.println("짝수입니다.");
				
			} else if (numb%2==1) {
				System.out.println("홀수입니다.");
			}
			
		} else if (numb<0) {	
			System.out.println("음수입니다.");
			
		} else {
			System.out.println("0입니다.");
		}
		
		
		
		sc.close();
		
	}

}
