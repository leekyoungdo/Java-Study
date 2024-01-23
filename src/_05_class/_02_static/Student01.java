package _05_class._02_static;

public class Student01 {
    // 1. 필드 정의
    private String name ;
    private String Student_Id;
    private int grade;
    // 클래스 변수 (static 변수) 총 학생수
    private  static int totalStudents = 0;

    public Student01 (String name, String Student_ID, int grade) {
        // 생성자로 이름, 학번, 학년 초가화, totalStudents 증가
        this.name = name;
        this.Student_Id = Student_ID;
        this.grade = grade;
        totalStudents++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudent_Id() {
        return Student_Id;
    }

    public void setStudent_Id(String student_Id) {
        Student_Id = student_Id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    // displayInfo 메서드 정의

    public void displayInfo () {
        System.out.println("\n===학생정보===");
        System.out.println("이름 : " + name);
        System.out.println("학번 : " + Student_Id);
        System.out.println("학년 : " + grade);
    }
    // 클래스 변ㅅ getter

    public static int getTotalStudents() {return totalStudents;}

    public static void main(String[] args) {
        // 학생 생성
        Student01 std1 = new Student01("김새싹" , "20230101", 1);
        Student01 std2 = new Student01("최새싹" , "20230102", 1);
        Student01 std3 = new Student01("이새싹" , "20230103", 1);

        std1.displayInfo();
        std2.displayInfo();
        std3.displayInfo();

        // 총 학생수 출력
        System.out.println("총 학생수는 : " + Student01.getTotalStudents());
    }
}
