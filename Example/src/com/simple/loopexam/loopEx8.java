package com.simple.loopexam;

import java.util.Scanner;

public class loopEx8 {

	public static void main(String[] args) {
		// 삼각형 별 찍기 (중앙 정렬)
		// 사용자로부터 정수 N을 입력받아 아래와 같은 삼각형을 출력하시오.
		Scanner kbd = new Scanner(System.in);
		int num = kbd.nextInt();

//		for (int i = 1; i <= num; i++) {
//			for (int s = 1; s <= num - 1; s++) {
//				System.out.print(" ");
//			}
//			for (int star = 1; star <= 2 * i - 1; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for (int i = 1; i <= num; i += 2) {
			for (int j = 1; j >= i; j -= 2) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
