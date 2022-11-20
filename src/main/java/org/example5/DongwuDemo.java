package org.example5;

public class DongwuDemo {
    public static void main(String[] args) {
        Dongwu dongwu = new Cat(12,"林青霞");
        System.out.println(dongwu.getName()+";"+dongwu.getAge());
        dongwu.shou();
    }
}
