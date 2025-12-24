package com.simple.Arrayexam;

public class ArrayExam01 {

	public static void main(String[] args) {
		// 배열에 난수 채우기
		// 길이가 10인 int 배열을 만들고, 1~100 사이 난수로 채운 뒤 모든 값을 출력하시오.
		
		int [] Num = new int[10];
		int jumsu = 0;
		
		for (int i = 0; i < Num.length; i++) {
			jumsu = (int) (Math.random() * 100 + 1);
			Num[i] = jumsu;
			System.out.print(Num[i] + " ");
		}
		

	}

}
