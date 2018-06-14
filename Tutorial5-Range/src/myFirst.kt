fun main(args: Array<String>) {


    //Range..
    var r1 = 1..5;
//    this range contains the number 1,2,3,4,5

    var r2 = 5 downTo 1;
//    this range contains the number 5,4,3,2,1
    var r3 = 50 downTo 1;

    //skip number steps like 3 steps etc.

    var r4 = 5 downTo 1 step 2;
    //this range contain the number 5,3,1

    var r5 = "a".."z";
    //this range contain the number "a","b","c",....,"z"


    //now we want to check character 's' is present in r5??

    var isPresent = 's'.toString() in r5;
    print(isPresent);//it print true or false..


    //similarlty for countDown... 50 to 1...


    var countDown = 10.downTo(1);//it will decrement by 1.
    //this range contain the number 10,9,8,7,6,...,1


    var moveUp = 1.rangeTo(10);//it will increment by 1;
    //this range contain the number 1,2,3,4,5,6,...,10;
}