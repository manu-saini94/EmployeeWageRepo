package com.bridgelabz.exceptions;

public class ExceptionClass2 {

    public static void main(String[] args) {
        String x = "10";
        String y = "0";
        int result;
        x = "2.5";
        y = "3.5";
        try {
            int num1 = Integer.parseInt(x);
            int num2 = Integer.parseInt(y);
            result = num1 / num2;
            System.out.println("Result:" + result);
        }
        catch (NumberFormatException nfe) {
            System.out.println("number format exc " + nfe.getMessage());
        }
        catch (ArithmeticException ae) {
            System.out.println("arithmetic exc " + ae.getMessage());
        }
        catch(Exception ex){
            System.out.println("Exception:"+ex.getMessage());
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("normal execution of code");


    }
}
