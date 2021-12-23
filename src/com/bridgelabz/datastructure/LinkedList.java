package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedList {

    Node head;
    Node tail;


    public Node add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        String s = new String();
        String[] str = s.split(" ");


        return newNode;
    }

    public void show() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public Node append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        return newNode;
    }

    public Node search(int data) {
        Node temp = head;
        while (temp!= null && temp.data != data) {
            temp = temp.next;
        }
        return temp;
    }

    public Node  insertAfter(int searchData, int insertData) {
        java.util.LinkedList list = new java.util.LinkedList();
        list.add(1);
        list.add(2);
        System.out.println("iterator");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(".........");
        Node searchedNode = search(searchData);
        if (searchedNode == null)
            return searchedNode;
        Node newNode = new Node(insertData);
        Node temp = searchedNode.next;
        searchedNode.next = newNode;
        newNode.next = temp;
        if ((searchedNode == head && searchedNode == tail) || searchedNode == tail) {
            tail = newNode;
        }
        return newNode;
    }



}


