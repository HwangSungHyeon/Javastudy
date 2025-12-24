package com.simple.loopexam;

import java.util.Scanner;

public class loopEx3 {

	public static void main(String[] args) {
		//역순 출력하기
		//사용자로부터 문자열을 입력받아 반복문을 사용하여 역순으로 출력하시오.
		
		Scanner kbd = new Scanner(System.in);
		String str = kbd.nextLine();
		
		for (int i = str.length() - 1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
