package YHDL;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1 = sc.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
    }
}
