package com.simple.method;

public class MethodExam {

	public static void main(String[] args) {
		// 메서드 : 입력-> 처리-> 출력
		// MethodExam -> MethodExam2 메서드로 변경
		
		// 사칙연산 계산기 만들기
		
		
		// 데이터 입력 : 정수 2개
		int num1 = 5;
		int num2 = 2;
		
		int sum, sub, mul;  // 더하기, 빼기, 곱하기
		double div;         // 나누기
		
		// 데이터 처리 : +, -, x, /
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = (double)num1 /num2;  //double을 넣어야 계산이 정확해짐.
		
		//데이터 출력 : 사칙연산 결과 출력
		System.out.println("num1 num2 합  차  곱  몫");
		System.out.printf("%2d %4d %3d%3d %3d %.2f \n",
				num1, num2,
				sum,sub,mul,div);

	}

}
