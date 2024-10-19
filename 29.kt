//Write a program that accept the number from user and check its negative, positive or zero

fun main() {
    // Prompting the user to enter a number
    println("Enter a number:")
    val number = readLine()?.toDoubleOrNull()

    // Checking if input for the number is valid
    if (number == null) {
        println("Invalid input. Please enter a valid number.")
        return
    }

    // Checking if the number is negative, positive, or zero
    val result = when {
        number > 0 -> "positive"
        number < 0 -> "negative"
        else -> "zero"
    }

    // Displaying the result
    println("The number $number is $result.")
}
