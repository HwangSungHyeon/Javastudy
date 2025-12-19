package com.simple.loop;

public class LoopWhile {

	public static void main(String[] args) {
		
		// for : 정해진 횟수 만큼 반복
		// 1,2,3,4,5~10
		// for 괄호안에 숫자를 넣게되면 값이 유효한 범위로 쉽게 (영역)이라고 생각하면 된다.
		int i;
		for( i = 0; i < 10; i++) {
			
			System.out.println("i : "+(i+1));
		}
		
		i=0;
		while(i < 10) {
			System.out.println("1 :" +i);
			i++;
			// i++;는 while 문 마지막에 무조건 써야한다 (안쓰면 무한반복 됨.)
			// 1부터 쓰고싶으면 i++;를 순서를 바꾸면 된다.
		}
		
		// 1부터 n 까지의 숫자를 더해가면서 그 합이 100이상이 될때까지 반복하시오.
		i = 0;
		int sum = 0;
		int count = 0;
		int finalCount = 0;
		
		while(sum < 100) {
			sum = sum + i; // ※굉장히 중요한 부분
			System.out.println("합계 :" +sum);
			System.out.println("i :" +i);
			i++;
			finalCount = count++; // ※가장 간단하게 표현한 부분이므로 다른거 쓰면 복잡해짐.
		}
		
		// 반복횟수 출력
		System.out.println("반복횟수 :" +count);
		System.out.println("최종반복횟수:" +finalCount);

	}

}
