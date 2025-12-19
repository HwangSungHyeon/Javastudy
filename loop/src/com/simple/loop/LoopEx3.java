package com.simple.loop;

public class LoopEx3 {

	public static void main(String[] args) {
		
		//아스키 코드표 출력
		
		char c = 'A'; // 알파벳은 26개
		
		//이런 방법도 있지만 너무 길다.
//		System.out.println("문자 :"+c); 
//		c++;
//		System.out.println("문자 :"+c);
//		c++;
//		System.out.println("문자 :"+c);
		
		//그래서 이 방법으로 간단하게 사용.
//		for(int i = 0; i < 60; i++) {    
//			System.out.println("문자 :" +c);
//			c++;
//		}
		
//		//대문자 A~Z까지만 출력
//		//while 문을 사용해서 출력
		do {
			System.out.print(c);
			System.out.print(" : ");
			System.out.printf("%d \n",(int)c);
//			System.out.println(c+0);  ※printf 와 같은 효과.
			c++;
		}while(c <= 'Z');
		
	}

}
