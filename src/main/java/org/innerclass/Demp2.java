package org.innerclass;
//test final 对类，方法，变量的影响
public  class Demp2 {
    public static final String name = "walt";
    public final void  show(){
        //name = "ddd";
        System.out.println("final修饰");
    }
}
