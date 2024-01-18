package _02_control_statement;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        System.out.println("숫자 두가지를 입력해주세요  >>");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println(q(a, b));
        System.out.println(w(a, b));
        System.out.println(e(a, b));
        System.out.println(r(a, b));

    }
    public static double q(double a, double b)
    {return a + b;}
    public  static double w(double a, double b)
    {return a - b;};
    public  static double e(double a, double b)
    {return a * b;};
    public  static double r(double a, double b)
    {return a / b;};



}
