public fun main(args: Array<String>) {

    var name: String;

    name = "Muhammad Asher Ansari";

    var person = Person();

    person.display(name);
}

/*
fun display(name: String) {
    println(name);
}
use display method in new class;
*/

class Person {
    fun display(name: String) {
        println(name);
    }
}
