package com.bridgelabz.java8;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 *
 * @param
 * @return
 * @see
 *
 *
 *
 */



@FunctionalInterface
interface IMathFunction {
    int calculate(int a, int b);
}

//class MyConsumer implements Consumer<Integer>{
//
//    @Override
//    public void accept(Integer integer) {
//        System.out.println("List elem : "+integer);
//    }
//}

public class Java8Features {

    public enum CalculatorEnum {
        MULTIPLY,
        DIVIDE,
        ADDITION,
        SUBTRACTION
    }


    public void m2(CalculatorEnum calEnum){

    }


    public static void main(String[] args) throws IOException {


//        try(Reader fr = Files.newBufferedReader(Paths.get("ABC"));){
//
//
//        }
//        catch (){
//
//        }
        IMathFunction add = Integer::sum; // Method reference
        IMathFunction multiply = (a, b) -> a * b;
        IMathFunction divide = (a, b) -> a / b;


        System.out.println(CalculatorEnum.ADDITION +":" + add.calculate(1, 4));
        System.out.println(CalculatorEnum.MULTIPLY +":" +  multiply.calculate(4, 3));
        System.out.println(CalculatorEnum.DIVIDE +":" +  divide.calculate(4, 2));


        //   Consumer  , Function , Predicate  , Supplier .

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(6);
//        MyConsumer obj = new MyConsumer();
//        list.forEach((n) -> System.out.println(n+ " "));
//        List<Integer> integerList = list.stream().map(n-> n*5).filter(n -> n%2==0).collect(Collectors.toList());
//        integerList.forEach(n -> System.out.println(n + " "));

//
//        List list2 = list.stream().map((itm) -> {
//            Double val = Math.pow(itm, 3);
//            return val;
//        }).filter(itm -> itm%2 == 0).collect(Collectors.toList());
//
//        for (Object itm:list2) {
//            System.out.println(itm);
//        }
        
//        Iterator itr = list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

//        MyConsumer obj1 = new MyConsumer();
//        Consumer obj2 = new MyConsumer();
//        list.forEach(obj1);

//        Consumer obj = new Consumer() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        }
//        list.forEach(new Consumer() {
//            @Override
//            public void accept(Object integer) {
//                System.out.println("List elem : " + integer);
//            }
//        });

//        Consumer<Integer> consumer = n -> System.out.println("List elem : " + n);
//        list.forEach(n -> System.out.println("List elem : " + n));

//        Function<Integer,Double> obj2 = t -> (double)t;
//        Predicate<Integer> predicate = n -> {
//            if (n % 2 == 0) return true;
//            else
//                return false;
//        };
//        System.out.println(predicate.test(2));
//        System.out.println("Double Value:"+obj2.apply(5));



    }


//class A implements IMathFunction{
//
//    @Override
//    public int calculate(int a, int b) {
//        return 0;
//    }
//    public void m2(int a){
//        System.out.println("A");
//    }
//
//}




}
