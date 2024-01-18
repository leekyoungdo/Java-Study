import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();

        System.out.println("문자열을 입력하세요.");

        while (true) {
            System.out.print("입력: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            stringList.add(input);
        }

        System.out.println("\n입력된 문자열 목록:");

        for (String str : stringList) {
            System.out.println(str);
        }

        scanner.close();
    }
}
