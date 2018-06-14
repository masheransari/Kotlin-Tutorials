fun main(args: Array<String>) {


    var a = 2;
    var b = 5;

    //method 1;
//    var maxValue: Int;
//    if (a > b) {
//        maxValue = a;
//    } else {
//        maxValue = b;
//    }
//    println(maxValue);


//    //Method 2.
//    var maxValue: Int=if (a > b) {
//                            a;
//                        } else {
//                            b;
//                        };
//
//    println(maxValue);


    //Method 3.
    var maxValue: Int=if (a > b) {
                           println("a is Greater");
                           a
                        } else {
                           println("b is Greater");
                           b;
                        }
    print(maxValue);
}