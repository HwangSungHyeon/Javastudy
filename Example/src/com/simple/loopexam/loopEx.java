package com.simple.loopexam;

import java.util.Scanner;

public class loopEx {

	public static void main(String[] args) {
		//1부터 N까지의 수 중 소수 판별하기
		//사용자로부터 정수 N을 입력받아 1부터 N까지의 수 중 소수만 출력하시오.
		
		int num;
		
		Scanner kbd = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		num = kbd.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			if(i % 2 == 1 && i % 3 == 2) {
				System.out.print(i + ", ");
			}
		}
		
	}

}
