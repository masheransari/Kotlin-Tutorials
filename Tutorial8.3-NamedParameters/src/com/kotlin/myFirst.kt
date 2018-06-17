@file:JvmName("MyFirstKTFile")

package com.kotlin

fun main(args: Array<String>) {

//    findVolume(10,20,30);
    findVolume(height = 10,volumn = 50,width = 30);
    println("-----------------------------------");
    findVolume(30,10,50);
    println("-----------------------------------");
    findVolume(height = 50,width = 10);
}

fun findVolume(width: Int, height: Int, volumn: Int = 30) {

    println("Width: "+width);
    println("height: "+height);
    println("volumn: "+volumn);
}