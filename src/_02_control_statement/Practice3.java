package _02_control_statement;

public class Practice3 {
    public static void main(String[] args) {
        Practice3 ol = new Practice3();

        System.out.println("원 :" + ol.add(5));
        System.out.println("사각형 : " + ol.add1(4,7));
        System.out.println("삼각형 : " + ol.add3(6,3));
    }

    public double add(double a) {return a * a * Math.PI;}
    public double add1(double a, double b) {return a * b;}
    public int add3(int a, int b) {return a * b / 2;}
}
