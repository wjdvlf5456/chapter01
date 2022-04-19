package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요. [0이면 종료]");
		int sum = 0;										// 합계
		/*
		do {
			int num = sc.nextInt();							// 입력받은 값
			System.out.print("합계: ");						
			System.out.println(sum = sum + num);
		} while (sum != 0);
		*/
		System.out.println("===========================");
		while (true) {
			int num = sc.nextInt();
			sum=sum+num;
			System.out.println("합계: "+sum);
			if (sum==0) {
				break;
			}
		}
		System.out.println("종료");
		sc.close();
	}

}
