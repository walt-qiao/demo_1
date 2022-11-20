package org.example5;

public abstract class Dongwu {
    private int age;
    private String name;

    public Dongwu(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Dongwu() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void shou();
    public void shou2(){
        System.out.println("动物类 show2");
    }
}
