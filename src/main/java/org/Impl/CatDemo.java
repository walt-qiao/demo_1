package org.Impl;

public class CatDemo {
    public static void main(String[] args) {
        InterImpl inter = new Cat();
        inter.eat();
        inter.show();
        inter.setAge(12);
        inter.setName("林青霞");
        System.out.println(inter.getAge()+","+inter.getName());
        Dog dog = new Dog();
        dog.eat();

        Inter inter1 = new Dog();
        inter1.eat();
    }
}

