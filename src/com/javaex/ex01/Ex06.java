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
		}
	}
