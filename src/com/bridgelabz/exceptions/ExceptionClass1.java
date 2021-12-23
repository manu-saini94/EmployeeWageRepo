package com.bridgelabz.exceptions;


import java.io.FileReader;

//                    Throwable(C)
//           Exception(C)          Error(C)
//       checked     unchecked
//      ....          ....
public class ExceptionClass1 {
    public static void main(String[] args) {


//        FileReader fr =new FileReader("AC");
        int x=6;
        int y=0;
        int result;
        try {
            result = (x / y);
            System.out.println("Result:" + result);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("Outside try-catch");

    }
}
