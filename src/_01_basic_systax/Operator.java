package _01_basic_systax;

public class Operator {
    public static void main(String[] args) {
        int x, y;
        float a, b;

        // 대입 연산자 ( = )
        x = 10;
        y = 5;
        a = 5.0f;
        b = 10.0f;

        // 산술 연산자: 숫자형 데이터에 대해서 산술 연산 가능
        System.out.println("===x, y===");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        System.out.println("=== a, b ===");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + ( a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + ( b / a)); // 출력 : 0 (y/x =  2)
        System.out.println("a % b = " + ( a % b));

        // 증가, 감소 연산자
        System.out.println("=== 증감 연산자 ===");
        System.out.println("x++ = " + x++ + ' ' + x); // 후위 증가
        System.out.println("++x = " + ++x); // 전위 증가
        System.out.println("x-- = " + x-- +' ' + x); // 후위 감소
        System.out.println("--x = " + --x); // 후위 증가

        // 산술적안 대입 연산자
        System.out.println("=== 산술적인 대입 연산자 ===");
        System.out.println(x);
        System.out.println("x += 5 >> " + (x += 5));
        System.out.println("x -= 5 >> " + (x -= 5));
        System.out.println("x *= 5 >> " + (x *= 5));
        System.out.println("x /= 5 >> " + (x /= 5));
        System.out.println("x %= 5 >> " + (x %= 5));


        // 비교 연산자 : 연산 결과 불리언 (true/false)
        System.out.println("=== 비교 연산자 ===");
        System.out.println("a > b >> "+ (a > b));
        System.out.println("a >= b >> "+ (a >= b));
        System.out.println("a < b >> "+ (a < b));
        System.out.println("a <= b >> "+ (a <= b));
        System.out.println("a == b >> "+ (a == b));
        System.out.println("a != b >> "+ (a != b));


        // 논리 연산자: 연산 결과 불리언 (true/false)
        boolean j = true;
        boolean k = false;
        boolean l = true;

        System.out.println("===논리 연산자===");
        System.out.println("j && k >> " + (j && k)); // AND: j, k 모두 참이여야 참
        System.out.println("j && l >> " + (j && l));
        System.out.println("j || k >> " + (j || k)); // OR: j, k 둘중 하나라도 참이면 참
        System.out.println("!j >> " + (!j)); // NOT 부정

        // 삼항 연산자

        System.out.println("===삼항 연산자===");
        System.out.println(x > y ? "x는 y보다 큼" : "x는 y보다 크지않음");

        // 연산자 우선 순위
        // 연산자 우선 순위에 따라서 계산. 명시적으로 지정하고 싶다면, 괄호로 묶어 우선순위 지정 가능

    }
}
