fun main(args: Array<String>) {

    //Continue statement tutorial...

    for (i in 1..10) {
        if (i % 2 == 0) {
            continue;
        }
        println(i);
    }


    //now we want to skipping in specific item at specific id.. in nested loop using continue statement..

//    //we want to skip at i==4 and j==3 position.. execution.
//    for (i in 1..5) {
//        for (j in 0..i) {
//            if (i == 4 && j == 3) {
//                continue;
//            }
//            println("Inner Loop: $i , $j");
//        }
//        println("OuterLoop: I=" + i);
//    }

    //Skiping loop Execution in specific position (Stoping outerLoop)
//    //we want to skip at i==4 and j==3 position.. execution.
    myOuterLoop@ for (i in 1..5) {
        for (j in 0..i) {
            if (i == 4 && j == 3) {
                //it will stop outer loop and start from next index..
                continue@myOuterLoop;
            }
            println("Inner Loop: $i , $j");
        }
        println("OuterLoop: I=" + i);
    }
}