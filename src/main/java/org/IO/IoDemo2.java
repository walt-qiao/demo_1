package org.IO;

public class IoDemo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("org.IO.IoDemo");
        System.out.println(aClass);
    }

}
