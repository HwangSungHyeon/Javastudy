package com.simple.loopexam;

import java.util.Scanner;

public class loopEx2 {

	public static void main(String[] args) {
		//자리수 합 구하기
		//사용자로부터 정수를 입력받아 각 자리수를 모두 던한 합을 출력하시오.
		
		Scanner kbd = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = kbd.nextInt();
		int sum  = 0;
		
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		System.out.println(sum);
	}

}
