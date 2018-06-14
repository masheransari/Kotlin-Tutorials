fun main(args: Array<String>) {
    println("Hello World");
    //in line comment.
    /*multiple line comment**/

    //variable.
    var myString = "hello World";

    println(myString);
    if (myString is String) {
        println("MyString is String");
    } else {
//    if (myString !is String) {
        println("MyString is Not String");
//    }
    }
    var myNumber = 10;
    var myDecimalNumber = 10.4;

    //we can initialize Stringm int boolean like that..


    var stringData: String;
    stringData = "initializing String variable";    //Mutable String
    var intData: Int;   //Mutable int
    var decimalData: Float;   //Mutable Float
    var booleanData: Boolean;   //Mutable Boolean
    intData = 1;
    decimalData = 1f;
    booleanData = false;

    //for write un editable String link constant final in java. simple use "val" keyword

    val unChangeAbleDataInt = 10;   //Immutable Int
    val unChangeAbleDataString = "This String cannot be edit in class.";   //Immutable String
}