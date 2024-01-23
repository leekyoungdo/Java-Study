package _05_class._03_final;

// final 변수
// -final 키워드가 지정된 변수는 한번 초기화면 값 변경 할 수 없음
public class FinalVariableEx {
    public static void main(String[] args) {
        final int finalNumber = 10;

        // 초기화된 값을 변경하려고 하면 컴파일 오류 발생
        // finalNumber = 20; // 에러 발생

        // 읽기 전용
        System.out.println("Final Number : " + finalNumber);
    }
}
