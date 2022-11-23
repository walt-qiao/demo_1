package org.innerclass;

public class Demo3 {
    public static void main(String[] args) {
        show2();
    }
    public static void show(){
        int i = 5;
        System.out.println("hello");
        System.out.println(i*1.00);
        double v = i * 1.0;
        System.out.println(v);
        System.out.println(i+""+2);
        String s = i + "";
        System.out.println(s);
    }
    public static void show2(){
        String s = "Hello";
        String s1 = "Hello";
        String s2 =new String("Hello");
        System.out.println(s==s1);
        System.out.println(s2==s1);
        System.out.println(s1.equals(s2));
    }
}
