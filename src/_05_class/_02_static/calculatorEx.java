package _05_class._02_static;

public class calculatorEx {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        double circleArea = num1 * num2 * Calculator.pi;
        int PlusResult =  Calculator.plus(num1, num2);
        int MinusResult = Calculator.minus(num1, num2);

        System.out.println("원의 넓이 : " + circleArea);
        System.out.println("더하기 결과 : " + PlusResult);
        System.out.println("빼기 결과 : " + MinusResult);
    }
}
