@file:JvmName("MyCustomKotlinFileName")

package com.kotlin

import com.java.myJavaFIle

fun main(args: Array<String>) {
    //Introparability Means:
//IMPORTANT:    you can call java function to kotlin function from java.
//    for eg: you can have java and kotlin both files in Same Project..


    var area = myJavaFIle.getArea(10, 100);
    println("Area: " + area);
}

fun add(a: Int, b: Int): Int {
    return a + b;
}