package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {
		
		/*
		관계연산자
		부등호를 사용할 때에는 무조건 결과는 true 아니면 false로 나온다.
		*/
		
		int n1 = 5;
		int n2 = 3;
		
		System.out.println(n1<n2);	//5<3 --> false
		System.out.println(n1>n2);	//5>3 --> true
		
		System.out.println(n1<=n2);	//5가 3보다 작거나 같냐? 라고 물어보는 식이다.
		System.out.println(n1>=n2); //5가 3보다 거나 같냐? 라고 물어보는 식이다.
		
		System.out.println(n1==n2);	//5와 3의 값이 같은지 묻고 있다. '=='가 자바에서 같다는 뜻이다.
		System.out.println(n1!=n2);	//5와 3의 값이 다른지 묻고 있다. '!'가 앞에 붙어있으면 부정의 뜻이다.
		
		boolean result = n1<n2;
		System.out.println(result);
		
		

	}

}
