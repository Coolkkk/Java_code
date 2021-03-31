package BZLK;



public class Student {
    private String name;
    private int age;
    public Student(){
        System.out.println("无参构造方法");
    }
    public Student(String name,int age){
        this.age = age;
        this.name = name;
        System.out.println("含参构造方法");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void show(){
        System.out.println(name+", "+age);
    }
}
