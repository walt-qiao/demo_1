package org.example2;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        int a = 2;
        String s="第一次循环";
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("hello world");
        arrayList.add("你好！");
        arrayList.add("2");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 1) {
                s=arrayList.get(i);
                System.out.println(s);
            }
            System.out.println(s+"q");
        }
    }
}
