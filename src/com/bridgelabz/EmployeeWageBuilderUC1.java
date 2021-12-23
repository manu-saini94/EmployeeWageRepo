package com.bridgelabz;

import com.bridgelabz.Sample.SampleClass;

public class EmployeeWageBuilderUC1 extends SampleClass{
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static int varStatic;
    public int varInst = 3;

    public void m1(){
        int x;


    }

    public static void m2(){


    }

    public static void main(String[] args) {
//        SampleClass c = new SampleClass();
//        EmployeeWageBuilderUC1 obj = new EmployeeWageBuilderUC1();
//        System.out.println(obj.x);
        int var = 0;
        System.out.println(var++ + ++var + var++);
        System.out.println(var++ + ++var);






      int[] array = new int[20];

      for (int i=0;i<=array.length-1;i++){
          array[i] = 2;
      }


//      int[][] array2D = new int[10][20];
//      for(int i=0;i<=array2D.length-1;i++){
//
//          for (int j=0;j<=array2D[i].length-1;j++){
//
//                  array2D[i][j] = i+j;
//              System.out.print(array2D[i][j] + " ");
//          }
//          System.out.println();
//
//      }

        int[][] array1 = new int[20][20];

//        for (int i=0;i<20;i++){
//            for (int j=0;j<20;j++){
//                array1[i][j] = i+j;
//            }
//        }
//        for (int[] val:array1) {
//            System.out.println();
//            for (int elem : val) {
//                System.out.print(elem+" ");
//            }
//        }



//        int empHrs = 0;
//
//        int empCheck = (int)((Math.random())*10)%3;
//
//        switch (empCheck){
//            case IS_FULL_TIME:
//                empHrs = 8;
//                break;
//            case IS_PART_TIME:
//                empHrs = 4;
//                break;
//            default:
//                empHrs = 0;
//        }
//
//      int empWage = empHrs * EMP_RATE_PER_HOUR;
//        System.out.println("Employee Wage :"+empWage);
    }
}

