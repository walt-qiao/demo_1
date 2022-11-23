package org.example3;

public class Demo {
    public static void main(String[] args) {
        show3();
    }

    public static void show() {
        My my = new My();
        my.showGrandpa();
        my.showFather();
        System.out.println("第二次上传");
        System.out.println("第二次上传");
    }

    public static void show2() {
        String ints = "12";
        Integer integer = Integer.valueOf(ints);
        System.out.println(integer);
        String s = integer.toString();
        System.out.println(s);
    }

    public static void show3() {
        String string= "12 21 32 56 75 87";
        String[] split = string.split(" ");
        for (int i = 0; i < split.length-1; i++) {
            System.out.println(split[i]);
        }
    }
}
