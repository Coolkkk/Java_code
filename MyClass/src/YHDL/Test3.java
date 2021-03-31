package YHDL;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.nextLine();
        String s1 = reverse(s);
        System.out.println("s1:" + s1);
    }

    public static String reverse(String c) {
        String cc = "";
        for (int i = c.length()-1; i >= 0; i--) {
            cc += c.charAt(i);
        }
        return cc;
    }
}
