package org.example5;


public class Cat extends Dongwu {

    public Cat(int age, String name) {
        super(age, name);
    }

    public Cat() {
    }

    @Override
    public void shou() {
        System.out.println("猫吃鱼");
    }
}
