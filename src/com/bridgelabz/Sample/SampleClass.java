package com.bridgelabz.Sample;


public class SampleClass extends ABC {

    protected int y = 10;
    static int x = 20;




    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
//        obj.m2(2);


    }

}
class DEF{
    public void methodAAA() {
        System.out.println("2A");
    }
}

class ABC implements Temp2,Behaviour{

    @Override
    public void methodTemp2A() {

    }

    @Override
    public int methodTemp2B() {
        return 0;
    }

    @Override
    public void sleep() {

    }

    @Override
    public void walk() {

    }
}

interface Temp2{
    void methodTemp2A();
    int methodTemp2B();
}

interface Behaviour{
    void sleep();
    void walk();
}

interface Temp1 extends Temp2,Behaviour{
    void m2();
}

