// Write a program that accept two numbers and perform all basic mathematicaloperation and print.

fun main() {
    // Accepting two numbers from the user
    println("Enter the first number: ")
    val num1 = readln().toDouble()

    println("Enter the second number: ")
    val num2 = readln().toDouble()

    // Performing basic mathematical operations
    val sum = num1 + num2
    val difference = num1 - num2
    val product = num1 * num2
    val quotient = if (num2 != 0.0) num1 / num2 else Double.NaN

    // Printing the results
    println("The sum of $num1 and $num2 is: $sum")
    println("The difference between $num1 and $num2 is: $difference")
    println("The product of $num1 and $num2 is: $product")
    println("The quotient of $num1 divided by $num2 is: $quotient")
}

