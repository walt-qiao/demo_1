package org.Impl;

public class Cat extends InterImpl implements  Inter{

    public Cat(int age, String name) {
        super(age, name);
    }
    public Cat(){}

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
