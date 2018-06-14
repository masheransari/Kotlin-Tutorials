public fun main(args: Array<String>) {

    var name: String;

    name = "Muhammad Asher Ansari";
    var person = Person();
    person.name = name;

    println("The Name of the person is: " + person.name);
    println("The Name of the person is: ${person.name}");//show name with in inverted commaas. rather than + concat.
//    person.display();

}

class Person {
    var name: String = "";

    fun display() {
        println(name);
    }
}
