package com.simle.exam2;

import java.util.Scanner;

public class middleEx01 {

	public static void main(String[] args) {

		//BMI 계산기
		//키(cm)와 몸무게(kg)를 입력받아 BMI를 계산하고, 정상/과체중/저체중을 판별하세요.
		
		//데이터 입력
		int kg = 0;
		int cm = 0;
		
		String result = "";
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("몸무게 입력 : ");
		kg = kbd.nextInt();
		
		System.out.print("키 입력 : ");
		cm = kbd.nextInt();
		
		//데이터 처리
		double M = (double)cm / 100;
		double bmi = kg / (M * M);
		
		//데이터 출력
		System.out.print("bmi : ");
		System.out.printf("%.2f" , bmi);

	}

}
