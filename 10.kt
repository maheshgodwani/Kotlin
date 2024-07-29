//Write a program to calculate area of triangle (a = 1/2hb)

fun main() {
    // Prompting the user to enter the base and height of the triangle
    println("Enter the base of the triangle:")
    val base = readln().toDoubleOrNull()

    // Checking if input for base is valid
    if (base == null || base <= 0) {
        println("Invalid input for base. Please enter a valid positive number.")
        return
    }

    println("Enter the height of the triangle:")
    val height = readln().toDoubleOrNull()

    // Checking if input for height is valid
    if (height == null || height <= 0) {
        println("Invalid input for height. Please enter a valid positive number.")
        return
    }

    // Calculating the area of the triangle
    val area = 0.5 * base * height

    // Displaying the result
    println("The area of the triangle with base $base and height $height is: $area")
}
