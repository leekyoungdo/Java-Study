package _05_class._05_abstract;

public class StudentEx {
    public static void main(String[] args) {
        Kim kim = new Kim("경돈임","새싹고",13,1993);
        Baek baek = new Baek("김봉빈","새싹중",9,1999);
        System.out.println("======"+ kim.name +"======");
        System.out.println("학교 : " + kim.school);
        System.out.println("나이 : " + kim.age);
        System.out.println("학번 : " + kim.classnumber);
        kim.todo();

        System.out.println("======"+ baek.name +"======");
        System.out.println("학교 : " + baek.school);
        System.out.println("나이 : " + baek.age);
        System.out.println("학번 : " + baek.classnumber);
        baek.todo();
    }
}
