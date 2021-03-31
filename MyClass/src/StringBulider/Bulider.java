package StringBulider;

import java.util.Scanner;

public class Bulider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1 = sc.nextLine();
        String s2 = myReverse(s1);
        System.out.println("反转后：" + s2);
    }

    public static String myReverse(String s) {
        StringBuilder s3 = new StringBuilder(s);
        s3.reverse();
        String s4 = s3.toString();
        return s4;

    }
}
