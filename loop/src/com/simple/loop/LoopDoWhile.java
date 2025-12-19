package com.simple.loop;

import java.util.Scanner;

public class LoopDoWhile {

	public static void main(String[] args) {
		
		// 키보드로 점수를 입력받아서 총점과 평균을 구한다.
		// 입력받은 점수의 숫자를 카운트 하여 평균을 구한다.
		int quit = 0;
		int jumsu = 0;
		int tot = 0; // 총점
		double avg; // 평균
		int count = 0; // 카운트 초기화
		
		Scanner kbd = new Scanner(System.in);
		
		do {
			
			do {
				System.out.print("점수 입력(0~100) :");
				jumsu = kbd.nextInt(); // 점수입력
				
			}while(jumsu < 0 || jumsu > 100);
			
			// 총점, 카운트
			tot += jumsu; //tot = tot + jumsu; 같은뜻인데 줄여서 쓰는게 편함
			count++; // 점수 카운트
			
			System.out.println("점수"+count+":"+jumsu);
			System.out.print("프로그램 종료 99:");
			quit = kbd.nextInt(); // 점수입력
			
		} while (quit != 99); // 99를 누르기 전까지 무한반복이라는 뜻임
		
		//평균 구하기
		avg = (double)tot / count; // 실수를 구하기위해 double을 쓴다.
		
		System.out.println("총점:" +tot);
		System.out.printf("평균: %.2f \n", avg);
		
		System.out.print("프로그램 종료");

	}

}
