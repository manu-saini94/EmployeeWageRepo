package com.bridgelabz.Oops;

interface ABC {
    Object Suv();
}

abstract class Car implements ABC {
    public abstract Object Suv();
}

abstract class Features extends Car {

    public abstract Object Suv();

    public void color() {
        System.out.println("color");
    }
}

abstract class Tyres extends Features {

    @Override
    public Object Suv() {
        return null;
    }

    public abstract void color();
}

public class Test2 {

    public static void main(String[] args) {
//        Car c = new Car();
//        c.Suv(); // parent method Suv()
//
//        Features f = new Features();
//        f.color(); // color
//        f.Suv(); // child method Suv()
//
//        Car obj1 = new Features();
//        obj1.Suv(); // child method Suv()
//
//        ABC t = new Tyres();
//        t.Suv();

//        Object obj = new Object();
//        obj.toString();
//        String abc = "ABC";
//        System.out.println("ABC".equals(abc));
//        obj.hashCode();


//        Features obj2 = new Car();

        // Run time polymorphism  -  taken care by JVM at runtime
        // lazy binding
        // overriding


    }
}
