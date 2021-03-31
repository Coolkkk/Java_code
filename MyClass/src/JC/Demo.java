package JC;

public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("wangkai");
        t1.setAge("30");
        System.out.println(t1.getAge() + "," + t1.getName());
        t1.teach();

        Teacher t2 = new Teacher("wangkkk", "33");
        System.out.println(t2.getAge() + "," + t2.getName());
        t2.teach();
    }
}
