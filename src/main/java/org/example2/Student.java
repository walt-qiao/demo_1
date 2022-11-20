package org.example2;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Student {

    public static void main(String[] args) {
    shou1();

    }
    public static void shou(){
        int a = 0;
        int b = 0;
        int c = 0;
       Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            if (i==1){
                a = scanner.nextInt();
            }else if (i==2){
                b = scanner.nextInt();
            }else c=scanner.nextInt();
        }

        int s = a>b?a:c;
        int max = Math.max(s, c);
        /*int ss = s>c?s:c;*/
        System.out.println(a+","+b+","+c);
    }
    public static void shou1(){
        //数组遍历
        String[] strings = {"a","b","c","d"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
    public static void shou2(){
        System.out.println("你好！444");
        System.out.println("你好！444");
    }
}
