package _04_exception;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("정수 5개를 입력해주세요 >>");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("원하는 배열의 크기 입력");
            int size = sc.nextInt();
            if (size <= 0) {
                throw new IllegalArgumentException("배열의 크기는 1이상");
            }
            int [] arr = new int[size];
            System.out.println(size + "개의 정수를 입력하세요.");
            int sum = 0;
            for (int i = 0; i < size; i++) {
                System.out.println("정수" + (i + 1) + ": ");
                arr[i] = sc.nextInt();
                        sum += arr[i];
            }
            double average = (double) sum / size;
            System.out.println("평균은" + average + "입니다." );
            }catch (java.util.InputMismatchException e) {
            System.out.println("정수만 입력해");
        }catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }
}
