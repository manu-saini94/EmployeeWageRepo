package com.bridgelabz.Oops;


import java.util.HashMap;

class A {

    public static void m1() {
        System.out.println("m1() of A");
    }
}
// private < default < protected < public
class B extends A {
    public static void m1() {
        System.out.println("m1() of B");
    }
}

public class AccessModifierSample {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("ABC","val");
        A a = new A();
        a.m1(); //
        B b = new B();
        b.m1(); //

//        B obj2 = new A();

        A obj = new B();
        obj.m1(); //

    }



}
