package YHDL;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.nextLine();
        int Bigcount = 0;
        int Smallcount = 0;
        int Numbercount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                Bigcount++;
            } else if (c >= 'a' && c <= 'z') {
                Smallcount++;
            } else if (c >= '0' && c <= '9') {
                Numbercount++;
            }
        }
        System.out.println("大写字母：" + Bigcount + "个");
        System.out.println("小写字母：" + Smallcount + "个");
        System.out.println("数字：" + Numbercount + "个");
    }
}