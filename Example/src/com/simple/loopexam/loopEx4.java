package com.simple.loopexam;

import java.util.Scanner;

public class loopEx4 {

	public static void main(String[] args) {
		//구구단 짝수 단만 출력하기
		//2단,4단,6단,8단만 출력하시오.
		
		for (int dan = 2; dan <= 8; dan+=2) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "x" + i + "=" + (dan * i));
			}
			System.out.println();
		}
	}

}
