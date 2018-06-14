fun main(args: Array<String>) {
//    val x = 2;

    //when Statement, it is like switch statement...

    //Method 1-> single line statement
//    when (x) {
//    //when x==1;
//        1 -> println("X is 1");
//        2 -> println("X is 2");
//        3 -> println("X is 3");
//        4 -> println("X is 4");
//        5 -> println("X is 5");
//    //default Conditions..
//        else -> println("X value is unKnown");
//    }


//    //Method 2-> for multiple line execution ..
//    when (x) {
//        1 -> {
//            println("X Found");
//            println("i Know x==1");
//        }
//        2 -> {
//            println("X Found");
//            println("i Know x==2");
//        }
//        3 -> {
//            println("X Found");
//            println("i Know x==3");
//        }
//        4 -> {
//            println("X Found");
//            println("i Know x==4");
//        }
//        5 -> {
//            println("X Found");
//            println("i Know x==5");
//        }
//        else->{
//            println("X Value is UnKnown");
//            println("I Don't Know What is X");
//        }
//    }


////    Method 3-> For Multiple Condition with Same Body..
//    val x = 0;
//    when (x) {
//        0, 1 -> {
//            println("x is either 0 or 1");
//        }
//        2, 4, 6, 8 -> {
//            print("x is even");
//        }
//        else -> {
//            println("X Value is UnKnown");
//            println("I Don't Know What is X");
//        }
//    }


//    //Method 4-> Using Ranges in When Condition.
//    val x = 11;
//    when (x){
//        in 1..20->{
//            println("x is between 1 to 20");
//        }
//        else->{
//            println("X is out of Range");
//        }
//    }


    //Method 5-> Using Ranges using Not in When Condition.
//    val x = 21;
//    when (x) {
//        !in 1..20 -> {
//            println("x is not in  1 to 20");
//        }
//        2 -> {
//            println("x is equal to 2");
//        }
//        else -> {
//            println("X is out of Range");
//        }
//    }


//    Method 6.1->
//    var result: String;
//    val x = 5;
//    when (x) {
//        1 -> result = "x is 1";
//        2 -> result = "x is 2";
//        3 -> result = "x is 3";
//        4 -> result = "x is 4";
//        else->{
//            result = "x is Unknown";
//        }
//    }
//    println(result);


//    Method 6.2->
    val x = 1;
    var result: String= when (x) {
        1 -> "x is 1";
        2 -> "x is 2";
        3 -> "x is 3";
        4 -> "x is 4";
        else->{
            "x is Unknown";
        }
    }
    println(result);
}