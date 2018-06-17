package com.java;

import com.kotlin.MyCustomKotlinFileName;

public class myJavaFIle {

    public static void main(String[] args) {
//        int number = MyFirstKt.com.kotlin.add(14, 30);
        int number = MyCustomKotlinFileName.add(14, 30);
        System.out.println("Printing sum from java file: " + number);
    }

    public static int getArea(int a, int b) {
        return a * b;
    }
}
