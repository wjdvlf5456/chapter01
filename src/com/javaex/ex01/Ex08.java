package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		System.out.println("산술연산자");
		//산술연산자
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);

		System.out.println(a/b); // 정수/정수 ---> 정수(몫)
		System.out.println(a%b); // 정수%정수 ---> 정수(나머지)
		
		//산술연산자 / % 자세히
		System.out.println("산술연산자 / % 자세히");
		System.out.println("=========");
		System.out.println(7/2);      //3
		System.out.println(7.0/2.0);  //3.5
		System.out.println(7%2);      //1
		System.out.println(7.0%2.0);  //1.0
		System.out.println("=========");
		
		//부호 연산자
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		
		System.out.println(pVar);
		System.out.println(mVar);
		
		//증감 연산자
		System.out.println("증감연산자");
		System.out.println(a);		//7
		System.out.println(++a);	//8  변수이전에 ++이나 -- 를 넣으면 그 변수부터 값이 적용된다. (값은 1씩 바뀐다.)
		System.out.println(a);		//8
		
		System.out.println(b);		//2
		System.out.println(--b);	//2 --> 1
		System.out.println(b);		//1
		
		System.out.println(a);		//8
		System.out.println(a++);	//8
		System.out.println(a);		//9
		
		System.out.println(b);		//1
		System.out.println(b--);	//1  변수이후에 ++이나 -- 를 넣으면 그 이후의 변수에 값이 적용된다. (값은 1씩 바뀐다.)
		System.out.println(b);		//0
		
	}

}
