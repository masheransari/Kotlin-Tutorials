fun main(args: Array<String>) {

//    @Method-1
//    for(i in 1..10){
//        println(i);
//        if (i==5){
//            break;
//        }
//    }


//    @Method-2
    //Break Nested For Loop..
//    for (i in 1..5) {
//        for (j in 0..i) {
//            println("Inner Loop: $i and $j");
//            if (i==3 && j==2){
//                //it stop inner loop rather than stop with outer loop..
//                //now how to fix this,..
//                //this condition is applicable for single loop..
//                //but if we have multiple nested loop then how can we stop in kotlin..??
//                //See @Method-3
//                break;
//            }
//        }
//        println("I = $i");
//    }


//    @Method-3
    //we will assign loop name
    //outer loop is tagged by myLoop@..
    myLoop@ for (i in 1..5) {
        for (j in 0..i) {
            println("Inner Loop: $i and $j");
            if (i == 3 && j == 2) {
                //it will stop outer loop or tagged loop..
                break@myLoop;
            }
        }
        println("I = $i");
    }


//    @Method-3

}