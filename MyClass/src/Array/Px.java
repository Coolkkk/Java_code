package Array;

import java.util.Arrays;

public class Px {
    public static void main(String[] args) {

        String s="91,27,46,38,50";
        String[] strArray = s.split(",");



     int[] arr = new int[strArray.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }


        Arrays.sort(arr);


        StringBuilder sc = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sc.append(arr[i]);
            } else {
                sc.append(arr[i]).append("  ");
            }
        }

        String result = sc.toString();
        System.out.println("result:" + result);


    }
}






