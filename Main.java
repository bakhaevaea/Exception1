package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        // 3 метода, которые выдадут  разные исключения:
        //getException_NumberFormat();
        //getException_ArrayIndexOutOfBounds();
        //getException_FileNotFound();

        int [] array1 = {17, 6, 5, 3, 19};
        int [] array2 = {10, 8, 0, -5, 15};
        int [] rez = arrayMinus(array1, array2);
        double[] rez2 = arrayDiv(array1, array2);
        for(int i=0; i< rez.length; i++)
            System.out.print(rez[i] + " ");

    }

    public static  void getException_NumberFormat(){
        String a = "A5";
        Integer aIntegerObj = new Integer(a);
        System.out.println(a+5);
    }
    public static  void getException_ArrayIndexOutOfBounds(){
        int [] arr = {0, 1, 2, 3, 4, 5};
        for (int i = 0; i<10; i++ ){
            System.out.println("arr["+i+"] = " + arr[i]);
        }
    }
  /*  public static  void getException_FileNotFound() {
        BufferedReader reader = new BufferedReader(new FileReader("Text.txt"));
        String s = reader.readLine();

    }*/
/*
    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен разности элементов 
    двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/
    public static int[] arrayMinus(int[] arr1, int[] arr2){
        int[] arrRes = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Размеры массивов не совпадают");
        }
        for (int i = 0; i < arrRes.length; i++){
            arrRes[i] = arr1[i] - arr2[i];
        }
        return arrRes;
    }

    /*
    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя.
    Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.*/
    public static double[] arrayDiv(int[] arr1, int[] arr2){
        double[] arrRes = new double[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Размеры массивов не совпадают");
        }
        for (int i = 0; i < arrRes.length; i++){
            if (arr2[i] == 0) {
                throw new RuntimeException("Делить на 0 нельзя");
            }
            arrRes[i] = arr1[i] / arr2[i];
        }
        return arrRes;
    }
}
