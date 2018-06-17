fun main(args: Array<String>) {

    println(findVolume(10, 10));
    println(findVolume(10, 10,10));
}

fun findVolume(width: Int, height: Int, volumn: Int = 30): Int {

    return width * height * volumn;
}