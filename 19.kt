//Write a program to read the value of X and Y and print the result of following expression (2X+3Y)/XY

fun main() {
    // Prompting the user to enter the value of X
    println("Enter the value of X:")
    val x = readln().toDoubleOrNull()

    // Checking if input for X is valid
    if (x == null || x == 0.0) {
        println("Invalid input for X. Please enter a valid non-zero number.")
        return
    }

    // Prompting the user to enter the value of Y
    println("Enter the value of Y:")
    val y = readln().toDoubleOrNull()

    // Checking if input for Y is valid
    if (y == null || y == 0.0) {
        println("Invalid input for Y. Please enter a valid non-zero number.")
        return
    }

    // Calculating the result of the expression (2X + 3Y) / (XY)
    val result = (2 * x + 3 * y) / (x * y)

    // Displaying the result
    println("The result of the expression (2X + 3Y) / (XY) is: $result")
}
