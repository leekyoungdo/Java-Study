package _04_exception;

public class Practice {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            for (int i = 0; i < 5; i++) {
                arr[i] = i;
                System.out.println( i + " : " + arr[i]);
            }
        }catch (
                ArrayIndexOutOfBoundsException e
        ) {
            System.out.println("인덱스 범위를 벗어남");
        }

    }
}
