package Cx;

import DT.Animal;
import DT.cat;

public class Demo {
    public static void main(String[] args) {
        Animal a = new cat();
        a.eat();
        a.setAge(20);
        a.setName("小白");
        System.out.println(a.getAge() + ", " + a.getName());

        System.out.println("--------");

        a = new cat("小白", 20);
        System.out.println(a.getAge() + ", " + a.getName());
        a.eat();
    }
}
