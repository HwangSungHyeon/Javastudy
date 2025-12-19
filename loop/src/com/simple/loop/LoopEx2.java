package com.simple.loop;

public class LoopEx2 {

	public static void main(String[] args) {
		// 구구단
		
		//for
		for(int i =1; i <=9; i++) {
			
			//System.out.println(2+"X"+i+":"+(2*i)); 
			//여기서 보기좋게 만들기 위해 밑에 있는걸 쓴다.
			System.out.printf("2 x %2d = %2d \n", i ,(2*i));
		}
		
		System.out.println();
		
        for(int i =1; i <=9; i++) {
			
			//System.out.println(2+"X"+i+":"+(2*i)); 
			//여기서 보기좋게 만들기 위해 밑에 있는걸 쓴다.
			System.out.printf("3 x %2d = %2d \n", i ,(2*i));
		}
	}

}
