package _05_class._05_abstract;

public abstract class Student {
    String name;
    String school;
    int age;
    int classnumber;

    public Student (String name, String school, int age, int classnumber) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.classnumber = classnumber;

    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getAge() {
        return age;
    }

    public int getClassnumber() {
        return classnumber;
    }

    abstract void todo();
}
