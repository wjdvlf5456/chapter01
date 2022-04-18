package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		
		System.out.print("단 : ");
		int num = sc.nextInt();
		
		
		//초기값
		int i = 1;
		//어디까지 반복할 지 조건식
		while (i<10) {
			//출력값
			System.out.println(num+" * "+i+" = "+num*i);
			//증감식
			i++;	//i=i+1;
		}
		
		sc.close();
	}

}
