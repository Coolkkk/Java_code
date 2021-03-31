package Jk;

public class Cat extends Animal implements Jummpping {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void Jump(){
        System.out.println("猫会跳高");
    }
}
