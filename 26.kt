//Write a program to check number is odd or even

fun main() {
    // Prompting the user to enter a number
    println("Enter a number:")
    val number = readLine()?.toIntOrNull()

    // Checking if input for the number is valid
    if (number == null) {
        println("Invalid input. Please enter a valid number.")
        return
    }

    // Checking if the number is odd or even
    val result = if (number % 2 == 0) {
        "even"
    } else {
        "odd"
    }

    // Displaying the result
    println("The number $number is $result.")
}
