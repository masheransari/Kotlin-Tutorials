fun main(args: Array<String>) {
    var i: Int = 1;
//Simple Do While Loop
//    do {
//        println(i);
//        i++;
//    } while (i <= 10);



    do {
//        println(i);
        if(i%2==0){
            println("Even Number: "+i);
        }
        else{
            println("Odd Number: "+i);
        }
        i++;
    } while (i <= 10);

}