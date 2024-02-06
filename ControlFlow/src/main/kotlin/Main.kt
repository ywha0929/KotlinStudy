import java.lang.Integer.parseInt

fun main(args: Array<String>) {
    var a: Int = 1;
    var b: Int = 2;
    var max: Int;
    if (a < b) {
        max = b
    };
    val max2 = if (a > b) a else b;
    val max3 = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b");
        b
    }
    when (a) {
        1-> println("x == 1");
        2-> println("x == 2");
        else -> {
            println("x is neither 1 nor 2");
        }
    }
    var res = when (a) {
        100 -> "A"
        90,89 -> "B"
        else -> "F"
    } // if when is used as expression the result becomes the expression's value
    // and in this case else is essential
    when (a) {
        parseInt("1") -> println("s encodes a");
        1+3 -> println("4");
        else -> println("s does not encode x");
    }
}