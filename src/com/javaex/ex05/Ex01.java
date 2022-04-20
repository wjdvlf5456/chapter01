package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {

		/*
		for (int i = 1; i <= 6; i++) {
			int num = (int) (Math.random() * 45) + 1;	//	int num = (int) (Math.random() * 45) + 1;
			System.out.print(num + "\t");				//	int num = (정수빼고 버려줌)(Math.random() * 최댓값) + 최소값;
		}
		 */

		int no1, no2, no3, no4, no5, no6;
		
		no1 = (int)(Math.random()*45)+1;
		no2 = (int)(Math.random()*45)+1;
		no3 = (int)(Math.random()*45)+1;
		no4 = (int)(Math.random()*45)+1;
		no5 = (int)(Math.random()*45)+1;
		no6 = (int)(Math.random()*45)+1;
		
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		System.out.println(no4);
		System.out.println(no5);
		System.out.println(no6);
		
		System.out.println("=================================");
		
		for (int i = 1; i <=6; i++) {
			int num = (int)(Math.random()*45)+1;
			System.out.println(num);
		}
		
		/*
		스태틱, 스택, 힙
		
		스태틱
		
		
		Scanner sc = new Scanner(Systemm.in);
		
		--------------------------------------
		스택
		
		
		
		
		
		
		--------------------------------------
		힙
		nextInt();	-->	(기능)
		
		
		 */
		

	}

}
