package org.innerclass;

public class Demo {
    public static void main(String[] args) {
        new Inter() {
            public void eat() {
                System.out.println("123");
            }
        }.eat();

       Inter inter1 = new Inter() {
            @Override
            public void eat() {
                System.out.println("23332");
            }
        };
        inter1.eat();
        inter1.eat();

        InterDemo I = new InterDemo();
        Inter inter= new InterOps();
        I.show(new Inter() {
            @Override
            public void eat() {
                System.out.println("匿名内部类");
            }
        });

    }
}
