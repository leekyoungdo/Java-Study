package _01_basic_systax;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("공백으로 구분하여 이름/나이를 입력해주세요. >>");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();

        System.out.println("안녕하세요! " + name+"님" + " " + "(" + age + ")" + "세");

    }
}
