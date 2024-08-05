//Write a program to read the value of X and Y and print the result of following expression 3X2+2XY+3Y2

fun main() {
    // Prompting the user to enter the value of X
    println("Enter the value of X:")
    val x = readln().toDoubleOrNull()

    // Checking if input for X is valid
    if (x == null) {
        println("Invalid input for X. Please enter a valid number.")
        return
    }

    // Prompting the user to enter the value of Y
    println("Enter the value of Y:")
    val y = readln().toDoubleOrNull()

    // Checking if input for Y is valid
    if (y == null) {
        println("Invalid input for Y. Please enter a valid number.")
        return
    }

    // Calculating the result of the expression 3X^2 + 2XY + 3Y^2
    val result = 3 * x * x + 2 * x * y + 3 * y * y

    // Displaying the result
    println("The result of the expression 3X^2 + 2XY + 3Y^2 is: $result")
}
