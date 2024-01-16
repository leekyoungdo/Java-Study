package _02_control_statement;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
//        int number = 10;
//
//        if(number % 2 == 0 ) {
//            System.out.println("짝수");
//        } else {
//            System.out.println("홀수");
//        }

        //////////////////////////
        // 문자열 (String) 객체 비교
//        System.out.println("이름을 입력해주세요 >> "); // 이경도
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine(); //엔터 이전까지의 문자열 받음
//        System.out.println("name 값 확인 :" + name);

        // Bad ('==' 대인 연산사 사용)
//        if (name == "이경도") {
//            System.out.println("환영합니다!");
//        }else {
//            System.out.println("이름을 다시 입력해 주세요.");
//        }

        // Good ('.equals()' 메서드 사용)
//        if (name.equals("이경도")) {
//            System.out.println("환영합니다!");
//        }else {
//            System.out.println("이름을 다시 입력해 주세요.");
//        }

        // Why?
        // - '==' 연산자 : 두 객체의 참조 비교 (동일한 메모리 위치 가르키는지 확인)
        // = '.equals()' 메서드 : 두 객채의 "내용"이 동일한지 비교

        // "문자열 리터럴" 의 경우, Java 에서 특별한 취급
        // 동일한 문자열 리터럴이 사용되는 경우, Java 컴파일러는 문자열 풀 (string pool)이라는
        // 공유된 메모리 영역에 해당 문자열을 저장
        // str1, str2가 같은 문자열을 가르키고 있으므로 같은 참조값을 가짐
//        String str1 = "hello";
//        String str2 = "hello";
//
//        if(str1 == str2) {
//            System.out.println("같은 참조값을 가리킴"); //출력
//        } else {
//            System.out.println("서로 다른 참조를 가리킴");
//        }
//
//        if (str1 .equals(str2)) {
//            System.out.println("내용이 같다"); // 출력
//        }else {
//            System.out.println("서로 다른 참조를 가리킴");
//        }

        // 문자열 "동적 할당" 의 경우, new String(...)을 사용해서 새로운 문자열 객체를 생성, -> 서로 다른 객체를 가리킴
        // str3, str4가 다른 객체이므로, '==' 연산자로 비교시 false
        // 따라서 문자열 비교시 (내용) 'equal()' 메서드로 비교하는 것이 바람직
        String str3 = new String("hi");
        String str4 = new String("hi");

        if(str3 == str4) {
            System.out.println("같은 참조값을 가리킴"); //출력
        } else {
            System.out.println("서로 다른 참조를 가리킴");
        }

        if (str3 .equals(str4)) {
            System.out.println("내용이 같다"); // 출력
        }else {
            System.out.println("서로 다른 참조를 가리킴");
        }

        //////////////////////////////
        // switch ~ case 문
        // - 각 case 문의 break 문 선택 사항, break 문 생략시 바로 밑의 case 문으로 넘어감.

        String dayOfWeek;
        int day = 4;
        // 향상된 스위치 문
        dayOfWeek = switch (day) {
            case 1 -> "일요일";
            case 2 -> "월요일";
            case 3 -> "화요일";
            case 4, 5, 6, 7 -> "수~ 토요일";
            default -> "잘못된 입력입니다.";
        };
        System.out.println(dayOfWeek);
            // 구형 스위치문
//        switch (day) {
//            case 1:
//                dayOfWeek = "일요일";
//                break;
//            case 2:
//                dayOfWeek = "월요일";
//                break;
//            case 3:
//                dayOfWeek = "화요일";
//                break;
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//                dayOfWeek = "수~ 토요일";
//                break;
//            default:
//                dayOfWeek = "잘못된 입력입니다.";
//                break;
//        }
    }
}
