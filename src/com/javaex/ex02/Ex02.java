package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();	//<--키보드입력값
		System.out.println("입력하신 숫자는 " +num+ " 입니다.");
		
		sc.close();
		
	}

}
