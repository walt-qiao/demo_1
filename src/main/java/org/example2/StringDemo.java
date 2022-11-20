package org.example2;

public class StringDemo {
    public static void main(String[] args) {
        String s = "abcde";
        //遍历方法1
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        //遍历方法2
        char[] array = s.toCharArray();
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + "]");

            } else {
                System.out.print(array[i] + ", ");
            }

        }
    }
}
