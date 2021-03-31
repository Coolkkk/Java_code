package Cx;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("狗吃鸟");
    }
}
