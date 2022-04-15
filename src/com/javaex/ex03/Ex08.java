package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		
		int score = sc.nextInt();
		char grade;
		
		if (score>=90) {
			grade = 'A';
		} else if(score>=80){
			grade = 'B';
		} else if (score>=70) {
			grade = 'C';
		} else if (score>=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(grade+"등급");
		
		sc.close();
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		
		int point = sc.nextInt();
		
		if (point>=90) {
			System.out.println("A등급");
			
		} else if (90>point && point>=80) {
			// 90>85 && 85>=80    --> T&&T --> T 85점일 때 
			// 90>75 && 75>=80    --> T&&F --> F 85점일 때 
			System.out.println("B등급");
			
		} else if (80>point && point>=70) {
			System.out.println("C등급");
			
		} else if (70>point && point>=60) {
			System.out.println("D등급");
			
		} else {
			System.out.println("F등급");
		}
		
		sc.close();
	}

}
