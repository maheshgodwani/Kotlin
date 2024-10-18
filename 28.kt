//Write a program to that accept the number from user and check it is divisible by 5 or not.

fun main() {
    // Prompting the user to enter a number
    println("Enter a number:")
    val number = readLine()?.toIntOrNull()

    // Checking if input for the number is valid
    if (number == null) {
        println("Invalid input. Please enter a valid number.")
        return
    }

    // Checking if the number is divisible by 5
    val isDivisibleBy5 = number % 5 == 0

    // Displaying the result
    if (isDivisibleBy5) {
        println("$number is divisible by 5.")
    } else {
        println("$number is not divisible by 5.")
    }
}
