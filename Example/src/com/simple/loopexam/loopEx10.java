package com.simple.loopexam;

import java.util.Random;
import java.util.Scanner;

public class loopEx10 {

	public static void main(String[] args) {
		// 최대공약수(GCD) 구하기
		// 사용자로부터 두 정수를 입력받아
		// 반복문을 사용하여 최대공약수를 구하시오.

		Scanner kbd = new Scanner(System.in);
		int a = kbd.nextInt();
		int b = kbd.nextInt();

		int gcd = 1;

		for (int i = 1; i <= Math.min(a,b); i++) {
			if (a % i == 0 && b % i == 0) gcd = i;
		}

		System.out.println("GCD = "+gcd);
	}

}
