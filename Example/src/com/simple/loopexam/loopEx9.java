package com.simple.loopexam;

import java.util.Random;
import java.util.Scanner;

public class loopEx9 {

	public static void main(String[] args) {
		// 숫자 맞히기 게임 (범위 확장)
		// 프로그램이 1~50 사이의 정수를 하나 정해두고,
		// 사용자가 맞출 때까지 반복 입력을 받으시오.
		// 입력값이 정답보다 크면 "Down",
		// 작으면 "Up"을 출력하고, 맞으면 "정답!"을 출력하시오.

		Scanner kbd = new Scanner(System.in);
		Random random = new Random();

		int answer = random.nextInt(50) + 1;
		int guess = 0;

		while (guess != answer) {
			guess = kbd.nextInt();

			if (guess > answer)
				System.out.println("Down");
			else if (guess < answer)
				System.out.println("UP");
			else
				System.out.println("정답!");

		}

	}

}
