package com.bridgelabz.Oops;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Animal {
//This is Test class
    static String str = "Animal"; // This is test file updated file child1

    public  Object m1() throws IOException{
        System.out.println("Animal version");
        return null;
    }
}
       //    private < default < protected < public
class Monkey extends Animal {

     String str = "Monkey";

           // Method Hiding
     public  Object m1() throws EOFException,FileNotFoundException {
        System.out.println("Monkey Version");
        return null;
    }

    public void m2() {
        System.out.println("Monkey specific method");
    }

}

public class Test extends Monkey{

    public static void main(String[] args) {

        ArrayList<Float> list = new ArrayList<Float>();
        list.add(1.0f/0);
        list.add(2.0f);
        list.set(1,3.0f);

        System.out.println(list);
        Map<String,String> map = new HashMap<String,String>();

        map.put("A","LLLLLL");
        map.put("B","Akhil");
        map.put("B","Bharath");
        map.put("B","Dhanshree");
        System.out.println(map);

        Animal a = new Animal();
        System.out.println(a.str);
        Monkey b = new Monkey();
        System.out.println(b.str);
        Animal obj2 = new Monkey();  // can use parent class reference to hold child class object
        System.out.println(obj2.str);
//        Monkey obj3 = new Animal(); // cannot use child class reference to hold parent class object
//        obj.tempMethod(1);
//        obj.tempMethod('A'); // ASCII value
//        obj.tempMethod(1.0f);

    }




    public void tempMethod(String abc) {
        System.out.println("String :" + abc);
    }

    public void tempMethod(int i) {
        System.out.println("int method: " + i);
    }

    public void tempMethod(float i) {
        System.out.println("float method: " + i);
    }

//     Overloading is called Compile time polymorphism
//     Method resolution happens based on reference type
//     Early binding
//     static polymorphism


//     Overriding is callled Run-time polymorphism
//     Method resolution happens based on Run time object
//     Lazy binding
//     Dynamic polymorphism


//     Variable hiding
//     Shadowing

    Throwable t =new Throwable();
    Exception ex = new Exception();
    Error e = new Error();

}

//                                                    Throwable
//                                                       |
//          Exception                                                                     Error
//               |                                                                          |
// Runtime Exception     IOException           IE  .....                                 VM Error
//    |                   |                                                                 |
//Arithematic            FileNotFound                                                    OutOfMemoryError
//Null Pointer           EndOfFileException
//Class Cast Exception                                                                    StackOverflow Error
//
//UnChecked                                                                                    Unchecked

