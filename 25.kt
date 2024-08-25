//Write a program to find minimum and maximum no from 2 numbers.

fun main() {
    // Prompting the user to enter the first number
    println("Enter the first number:")
    val number1 = readLine()?.toDoubleOrNull()

    // Checking if input for the first number is valid
    if (number1 == null) {
        println("Invalid input for the first number. Please enter a valid number.")
        return
    }

    // Prompting the user to enter the second number
    println("Enter the second number:")
    val number2 = readLine()?.toDoubleOrNull()

    // Checking if input for the second number is valid
    if (number2 == null) {
        println("Invalid input for the second number. Please enter a valid number.")
        return
    }

    // Finding the minimum number
    val minNumber = if (number1 < number2) number1 else number2

    // Finding the maximum number
    val maxNumber = if (number1 > number2) number1 else number2

    // Displaying the result
    println("The minimum number between $number1 and $number2 is: $minNumber")
    println("The maximum number between $number1 and $number2 is: $maxNumber")
}
