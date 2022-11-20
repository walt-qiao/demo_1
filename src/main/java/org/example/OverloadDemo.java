package org.example;

public class OverloadDemo {

    public static void main(String[] args) {

            long begin = System.currentTimeMillis();
            System.out.println(begin);


    }
    public static void demo1(){
        System.out.println("demo1");
    }
    public static int demo1(int a,int b){
        int c = a+b;
        return c;
    }
    public static void demo1(String s){
        System.out.println(s);
    }
    public int demo2(){
        return 1;
    }
}
