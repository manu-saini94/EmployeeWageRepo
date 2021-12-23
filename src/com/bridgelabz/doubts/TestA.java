package com.bridgelabz.doubts;

class Animal{
    void m1(){
        System.out.println("animal m1");
    }
}

class Monkey extends Animal{
    void m1(){
        System.out.println("monkey m1");
    }

    void m1(int a){
        
    }

    public void m2(int a) {
    }
    private void m2() {
        System.out.println("m2");
    }
}

public class TestA {


    public static void main(String[] args) {

        Animal an = new Animal();
        an.m1();
//        System.out.println();
        Monkey m = new Monkey();
        m.m1();
//        System.out.println();
        Animal obj2 = new Monkey();
        obj2.m1();


//        int[][] array = {{2,4,4},{3,6,7,8}};
//        int[] array2 = {2,4,5,6};
//        Integer a=0;
//        int c = a.intValue();


//        ArrayList list = new ArrayList();
//        list.add(an);
//        list.add(m);
//        System.out.println(list);


//        System.out.println(array.length);
//        System.out.println(array2.length);
//
//        for (int i=0 ;i<array.length;i++){
//            for (int j=0;j<array[i].length;j++){
//                System.out.println(array[i][j]);
//            }
//        }
//
//        for (int[] arr:array) {
//            for (int b:arr){
//                System.out.println(b);
//            }
//        }
    }
}


