package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int hour = sc.nextInt();
		int salary= hour*10000;
		int overtime= (hour-8)*12000;
		if (hour<=8) {
			System.out.println("임금은 "+salary+"원 입니다.");
		} else {
			System.out.println("임금은 "+(80000+overtime)+"원 입니다.");
		}
		
		sc.close();

	}

}
