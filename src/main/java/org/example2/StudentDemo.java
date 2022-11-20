package org.example2;

public class StudentDemo {

    private String name;
    private int age;
    public StudentDemo(){};
    public StudentDemo(String name,int age){
        this.name= name;
        this.age=age;
    };
    //set
    public void setName( String name ){
        this.name = name;
    };

    public void setAge(int age) {
        this.age = age;
    }

    //get
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}
