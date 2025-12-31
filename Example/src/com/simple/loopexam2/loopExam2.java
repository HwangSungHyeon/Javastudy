package com.simple.loopexam2;

import java.util.Scanner;

public class loopExam2 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("정수를 입력하시오.");
        int N = kbd.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;

            if (sum > 50) {
                break;
            }
        }
        System.out.println("현재까지의 합 : " +sum);

    }
}
