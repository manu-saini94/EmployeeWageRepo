package com.bridgelabz.datastructure;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(30);
        list.show();
        System.out.println();
//        System.out.println(list.search(56));
        int a = 65;
        list.insertAfter(30,a);
        System.out.println(a);
        list.show();
        System.out.println();
        list.append(95);
        list.show();
    }
}



