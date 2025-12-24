package com.simple.loopexam;

import java.util.Scanner;

public class loopEx6 {

	public static void main(String[] args) {
		// 숫자 뒤집기 후 판별하기
		// 사용자로부터 정수를 입력받아 뒤집은 수가 원래 수와 같은지 판별하시오.
		// (예: 121 → "회문수", 123 → "회문 아님")
		
		Scanner kbd = new Scanner(System.in);
		int num = kbd.nextInt();
		int original = num;
		int rev = 0;
		
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		
		if (rev == original) System.out.println("회문수");
		else System.out.println("회문 아님");
	}

}
