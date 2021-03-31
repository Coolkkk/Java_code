package Class;

public class StudentDemo {

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + "," + s.age);
        s.age = 19;
        s.name = "王凯";
        System.out.println(s.name + "," + s.age);
    }

}
