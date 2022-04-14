package com.javaex.ex01;

public class Ex06 {
	
	public static void main (String[] args) {
		
		//자동형변환 1
		System.out.println(2+3.5);
		
		double var01 = 2+3.5;   //2-->2.0 으로 자동형변환됨
		System.out.println(var01);
		
		//자동형변환 2
		long var02 = 12345l;
		float var03 = 1.1f;
		
		System.out.println(var02+var03);
		
		float result = var02 + var03; //var02(12345l) --> 12345.0f
		System.out.println(result);
		
		
		//////////////////////////////////////////////////////////////
		
		//강제형변환
		float var04 = 1111.62345f; //반올림 안 됨
		int var05 = (int)var04;
		System.out.println(var05);
		
		//축소변환 정상
		int v01 = 10;
		byte v02 = (byte)v01;
		System.out.println(v02);
		
		//축소변환 비정상 (int --> byte)
		int v03 = 103029234;
		byte v04 = (byte)v03;
		System.out.println(v04);
		
		//확대변환(byte --> int) 다른 사람이 헷갈릴 거 같으면 주석을 달아주거나 혹은 (변수)를 입력해준다.
		byte v05 = 10;
		int v06 = (int)v05;
		System.out.println(v06);
		
		
		//실수 --> 정수
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//정수 --> 실수
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
		
		
	}
}
