package _03_array;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("정수 5개를 입력해주세요 >>");
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++){
            numbers[i] = sc.nextInt();
        }
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = sum / 5;
        System.out.println("평균은 " + average + "입니다. ");

        sc.close();
    }
}
