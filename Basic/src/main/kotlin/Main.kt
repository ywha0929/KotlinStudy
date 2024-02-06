package basic.main.file

import java.util.*
import kotlin.reflect.typeOf

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val a:Int = 1; // val is similar to java's final
    val b = 2;
    var c = 3; // var is Mutable variable;
    var d : Int;
    val s1 = "a is $a";
    print("s1 : $s1");

    if (a in 1..10) { // able to check range
        println("a is in range");
    }
    for(x in 1..5) {} //can perform for loop using range

    val items = listOf("apple", "banana","kiwi","avocado")
    for(item in items) {
        println(item)
    }
    items.filter{it.startsWith("a")}
        .sortedBy{it}
        .map{ it.uppercase(Locale.getDefault()) }
        .forEach{println(it) }

    val items2 = setOf("apple","banana","kiwi");
    when {
        "orange" in items -> println("orange");
        "apple" in items -> println("apple"); //if pass here, break when expression
        "banana" in items -> println("banana");
    }
    test();

    //there is no primitive type. Every thing is object

    //Array is Array class object
    val array1 = Array(5,{i->i.toString()});
    val array2 = arrayOf("0","1","2","3","4",5);
    println(array2);
    //String literal
    val s = "Hello world\n" // escaped literal, if you want to use special characters use \
    val s2 = """ 
        this is kotlin raw String';
    """.trimIndent()
}



fun describe(obj:Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        else -> "Unknown"
    }

fun getStringLength(obj :Any): Int? {
    if(obj is String) { // obj will be automatically casted to String
        return obj.length
    }
    else {
        return null;
    }
}

fun parseInt(str:String):Int? { // if a function has possiblity to return null add ? mark for nullable notation
    return null;
}

fun sum(a:Int, b : Int):Int {
    return a+b;
}

fun sub(a:Int, b: Int) = a-b; //return type is inferred

fun print(a:String):Unit { //Unit is void object, can be deleted
    println(a);
}

fun test () {
    var a: Int = 10000;
    var b: Int = 10000;
    println("${a === b}"); //identity same?
    println("${a == b}"); // value same?;
    // in JVM a,b is treated as primitive type
    // if b : Int? -> b would be treated as Integer (object)
    //Char type is not an number object
}