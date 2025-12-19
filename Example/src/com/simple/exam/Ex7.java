package com.simple.exam;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		// 요일 출력하기
		// 1~7 사이의 숫자를 입력받아 1은 월요일, 2는 화요일 … 7은 일요일을 출력하세요.
		
		//데이터 입력
		int num = 3;
		String day = "";
		
		//데이터 처리
		switch(num) {
		case 1:
		     day = "월";
		     break;
		case 2:
		     day = "화";
		     break;
		case 3:
		     day = "수";
		     break;
		case 4:
		     day = "목";
		     break;
		case 5:
		     day = "금";
		     break;
		case 6:
		     day = "토";
		     break;
		case 7:
		     day = "일";
		     break;
		}
		
		//데이터 출력
		System.out.println(num);
		System.out.println(day+"요일");

	}

}
