fun main(args: Array<String>) {

    //Simple While Loop Understanding.
    var i: Int = 1;
    //while(condition){
    //
    //increment or decrement
    // }
//    while (i <= 10) {
//        println(i);
//        i++;
//    }

    while (i <= 10) {
        if (i % 2 == 0) {
            println("Even Number: "+i);
        }
        else{
            println("Odd Number: "+i);
        }
        i++;
    }
}