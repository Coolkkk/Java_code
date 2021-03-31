package Jk;

public class AnimalDemo {
    public static void main(String[] args) {
        Jummpping j=new Cat();
        j.Jump();
        System.out.println("---------");
        Animal a=new Cat();
        a.setAge(20);
        a.setName("小王");
        System.out.println(a.getAge()+", "+a.getName());
        a.eat();
    }
}
