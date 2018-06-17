fun main(args: Array<String>) {

    //Unit = void..
//    add();
//    add(50,12);
//    println(addInt(50, 21));

    println("Max Number: "+max(18,27));
}

fun add() {
    var a = 6;
    var b = 15;
    var sum = a + b;
    println(sum);
}

fun add(a: Int, b: Int) {
    var sum = a + b;
    println(sum);
}

fun addInt(a: Int, b: Int): Int {
    return a + b;
//    println(sum);
}

fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a;
    } else {
        return b;
    }
}