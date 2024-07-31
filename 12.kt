//12. Write a program to calculate area of circle

import kotlin.math.PI

fun main() {
    // Prompting the user to enter the radius of the circle
    println("Enter the radius of the circle:")
    val radius = readln().toDoubleOrNull()

    // Checking if input for radius is valid
    if (radius == null || radius <= 0) {
        println("Invalid input for radius. Please enter a valid positive number.")
        return
    }

    // Calculating the area of the circle
    val area = PI * radius * radius

    // Displaying the result
    println("The area of the circle with radius $radius is: $area")
}
