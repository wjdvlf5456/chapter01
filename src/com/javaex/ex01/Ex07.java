package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
	
		// 예상: 1.25 실제출력결과: 1.0
		double v01 = 5/4;
		System.out.println(v01);
		
		// 예상: 1.0 실제출력결과: 1.25
		double v02 = (double)5/4;
		System.out.println(v02);
		
		// 예상: 1.0 실제출력결과: 1.25
		double v03 = 5/(double)4;
		System.out.println(v03);
		
		// 예상: 1.25 실제출력결과: 1.25
		double v04 = (double)5 / (double)4;
		System.out.println(v04);
		
		// 예상: 2 실제출력결과: 2
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05);
		
	}

}
