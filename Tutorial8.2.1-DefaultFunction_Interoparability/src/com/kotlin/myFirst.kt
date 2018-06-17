@file:JvmName("MyFirstKTFile")

package com.kotlin

fun main(args: Array<String>) {


    //now here we want to access findVolume method in java.
//    but java doesnot support default Function.
//    we want to pass just two paramereter it shows error in java file. it required 3 parameter,
//    then we will use @JvmOverloads in findVolume method..
//    this JvmOverloads will compatibile this function for java,.

}

@JvmOverloads
fun findVolume(width: Int, height: Int, volumn: Int = 30): Int {

    return width * height * volumn;
}