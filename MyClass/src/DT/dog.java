package DT;

public class dog extends Animal {
    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("狗吃鸟");
    }
}
