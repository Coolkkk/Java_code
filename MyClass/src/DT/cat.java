package DT;

public class cat extends Animal{
    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
