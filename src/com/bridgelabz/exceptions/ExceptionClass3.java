package com.bridgelabz.exceptions;


import java.io.IOException;

class I1{

    void m1(){
        try {
            throw new ArithmeticException();
        }catch (RuntimeException re){
            System.out.println("Runtime: "+re.getMessage());
        }
    }

    void m2() {
        try {
            throw new IOException();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
public class ExceptionClass3 {
    public static void main(String[] args) {
      I1  rv = new I1();
      rv.m1();
      rv.m2();
        System.out.println("main code");

    }
}
