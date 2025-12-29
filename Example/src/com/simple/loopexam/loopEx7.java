package com.simple.loopexam;

import java.util.Scanner;

public class loopEx7 {

	public static void main(String[] args) {
		// 1부터 N까지의 수 중 특정 조건 출력하기
		// 사용자로부터 정수 N을 입력받아 1부터 N까지의 수 중에서
		// 3의 배수는 "Three", 7의 배수는 "Seven"
		// 둘 다의 배수는 "ThreeSeven"을 출력하시오.

		Scanner kbd = new Scanner(System.in);
		int num = kbd.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 21 == 0)
				System.out.println("ThreeSeven");
			else if (i % 3 == 0)
				System.out.println("Three");
			else if (i % 7 == 0)
				System.out.println("Seven");
			else System.out.println(i);
		}

	}

}
