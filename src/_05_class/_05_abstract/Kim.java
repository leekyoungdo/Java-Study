package _05_class._05_abstract;

public class Kim extends Student {

    public Kim (String name, String school, int age, int classnumber) {
        super(name, school, age, classnumber);
    }

    @Override
    void todo() {
        System.out.println("오늘 저녁은 우리도 굶는다.");
    }
}
