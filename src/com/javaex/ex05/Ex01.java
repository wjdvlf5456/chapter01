package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			int num = (int) (Math.random() * 45) + 1;	//	int num = (int) (Math.random() * 45) + 1;
			System.out.print(num + "\t");				//	int num = (정수빼고 버려줌)(Math.random() * 최댓값) + 최소값;

		}

	}

}
