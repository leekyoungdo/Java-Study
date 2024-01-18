package _02_control_statement;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
//        System.out.println("공백으로 구분하여 나이를 입력해주세요. >>");
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//
//        if (1 <= age && age <= 7) {
//            System.out.println("유아");
//        } else if (8 <= age && age <= 13 ) {
//            System.out.println("초등학생");
//        } else if (14 <= age && age <= 16) {
//            System.out.println("중학생");
//        } else if (17 <= age && age <= 19) {
//            System.out.println("고등학생");
//        } else {
//            System.out.println("성인");
//        }

//        System.out.println("이름을 입력해주세요. >>");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//
//        if (name . equals("홍길동") ) {
//            System.out.println("남자");
//        } else if (name .equals("성춘향")) {
//            System.out.println("여자");
//        } else {
//            System.out.println("모르겠어요");
//        }

                Scanner sc = new Scanner(System.in);
                System.out.println("숫자를 입력하세요");

                int n = sc.nextInt();

                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }

                sc.close();
    }
}
