package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        /*long number_l= 10L;
        int number = Math.toIntExact(number_l);
       long number_l= 10L;
        int number= (int)number_l;*/

        /*Scanner scanner = new Scanner(System.in);
        int e = 0;
        System.out.println("请输入数值:");
        int q = scanner.nextInt();
        int w = scanner.nextInt();
        int number = q+w;
        e = q+1;
        String n = number == 10 ? "yes" : "no";
        System.out.println(n);*/

       /* for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <= 60; j++) {

                System.out.println(1+":"+j);
            }
            System.out.println(i+1 +": hello world");
        }*/
        /*int[] a = {12,23,43};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int[] b = new int[5];
        Arrays.fill(b,2);
        System.out.println(Arrays.toString(b));*/
        /*int[] b = {1,2,3,4,5,6,7};
        int[][] a = new int[2][3];
        Arrays.fill(a,b);
        System.out.println(Arrays.toString(a[1]));*/
        /*int[] a = new int[3];
        System.out.println(a);
        System.out.println(a[1]);
        System.out.println(a[2]);
        a[1] = 10;
        a[2] = 20;
        System.out.println(a[1]);
        System.out.println(a[2]);
        int[] b = a;
        System.out.println(b);
        b[1] = 15;
        System.out.println(a[1]);
        int[] c = new int[3];
        System.out.println(c);
        OverloadDemo overloadDemo = new OverloadDemo();
        int i = overloadDemo.demo2();
        System.out.println(i);
        OverloadDemo.demo1("hello");*/

        //数组反转
        int[] arr1 = {1,2,3,4,5,6};
        for (int i = 0; i < arr1.length; i++) {
            int a = arr1[i];
            arr1[i] = arr1[arr1.length-i-1];
            arr1[arr1.length-i-1] = a;
            System.out.println(arr1[i]);
        }
    }
}
