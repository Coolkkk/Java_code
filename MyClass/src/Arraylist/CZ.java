package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class CZ {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个字符串");
        String s1 = sc.nextLine();
        System.out.println("请输入第2个字符串");
        String s2 = sc.nextLine();
        System.out.println("请输入第3个字符串");
        String s3 = sc.nextLine();
        array.add(s1);
        array.add(s2);
        array.add(s3);
        System.out.println(array);
         /*   for (int i = 0; i < array.size(); i++) {
            String s4 = array.get(i);
            System.out.println(s4);
        }
         */
    }
}
