package JC;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, String age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("教书");
    }
}
