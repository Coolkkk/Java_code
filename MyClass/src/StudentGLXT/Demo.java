package StudentGLXT;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println("-------欢迎来到学生管理系统-------");

            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            switch (s) {
                case "1":
                    // System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    // System.out.println("修改学生");
                    updatStudent(array);
                    break;
                case "4":
                    //System.out.println("查看学生");
                    findStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
                default:
                    System.out.println("你输入的数据有误，请重新输入");
            }
        }
    }

    /* public static void addStudent(ArrayList<Student> array) {
         Scanner sc = new Scanner(System.in);
         System.out.println("请输入学生学号");
         String sid = sc.nextLine();
         System.out.println("请输入学生姓名");
         String name = sc.nextLine();
         System.out.println("请输入学生年龄");
         String age = sc.nextLine();
         System.out.println("请输入学生居住地");
         String adress = sc.nextLine();

         Student s = new Student();
         s.setSid(sid);
         s.setAge(age);
         s.setAdress(adress);
         s.setName(name);

         array.add(s);

         System.out.println("添加学生成功");


     }
     */
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        String sid;

        while (true) {
            System.out.println("请输入学生学号");

            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号被使用，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地");
        String adress = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setAge(age);
        s.setAdress(adress);
        s.setName(name);

        array.add(s);

        System.out.println("添加学生成功");


    }

    public static void findStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无信息，请先添加再查询");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t居住地");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAdress());
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入删除学生学号");
        String sid = sc.nextLine();
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("你输入的信息不存在，请重新输入");
        } else {
            array.remove(index);
            System.out.println("删除学生成功");
        }

    }

    public static void updatStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入修改学生学号");
        String sid = sc.nextLine();

        System.out.println("请输入学生新姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生新住址");
        String adress = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setAge(age);
        s.setAdress(adress);
        s.setName(name);
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("你输入的信息有误，请重新输入");
        } else {
            array.set(index, s);
            System.out.println("修改学生成功");
        }

    }

    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}