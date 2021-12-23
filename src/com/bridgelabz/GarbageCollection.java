package com.bridgelabz;

public class GarbageCollection {

   public static int x = 10;

   private int y = 20;

    public static void main(String[] args) {

        GarbageCollection obj1 = new GarbageCollection();
        GarbageCollection obj2 = new GarbageCollection();
        obj1.y = 200;
        x = 100;
        System.out.println(x);
        System.out.println("main : "+ obj2.y + " .... "+obj1.y);
        obj1.sampleMethod2();
        obj1.sampleMethod3();
//        obj2.sampleMethod3();
    }

    public void sampleMethod2(){
        System.out.println("sample method 2");
        GarbageCollection obj2 = new GarbageCollection();
        System.out.println(x);
        System.out.println(y);
        System.out.println(obj2.y);
    }

    public void sampleMethod3(){
        System.out.println("sample method 3");
        System.out.println(x);
        System.out.println(y);
    }


}
