package com.simple.loopexam;

import java.util.Scanner;

public class loopEx5 {

	public static void main(String[] args) {
		// 1부터 N까지의 수 중 완전수 판별하기
		// 사용자로부터 정수 N을 입력받아 1부터 N까지의 수 중 완전수를 출력하시오.
		// (완전수: 자기 자신을 제외한 약수의 합이 자기 자신과 같은 수, 예: 6, 28)
		
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		
		for (int i = 1; i <=n; i++) {
			int sum = 0;
			
			for (int j = 1; j < i; j++) {
				if (i % j ==0) sum +=j;
			}
			
			if (sum == i) System.out.print(i + " ");
		}
	}

}
