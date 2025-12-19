package com.simple.exam;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		// 학점 판별하기
		// 점수를 입력받아 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 그 외는 F를 출력하세요.
		
		//데이터 입력
		int grade = 0;
		String result = "";
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("성적입력 : ");
		grade = kbd.nextInt();
		
		//데이터 처리
		if(grade >= 90) {
			result = "A";
		}else if(grade >=80) {
			result = "B";
		}else if(grade >=70) {
			result = "C";
		}else {
			result = "F";
		}

		//데이터 출력
		System.out.println("성적:"+grade);
		System.out.println("결과 : "+result);

	}

}
