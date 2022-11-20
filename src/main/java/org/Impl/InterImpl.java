package org.Impl;

public abstract class InterImpl implements Inter{
    private int age;
    private String name;

    public InterImpl(int age, String name) {
        this.age = age;
        this.name = name;
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

    public InterImpl() {
    }

    public void show(){
       System.out.println("接口实现类");
   }
}
