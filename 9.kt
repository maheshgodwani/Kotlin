//Write a program to find volume of cylinder (v = 3.14r2h )

import kotlin.math.PI

fun main() {
    // Prompting the user to enter the radius and height of the cylinder
    println("Enter the radius of the cylinder:")
    val radius = readln().toDoubleOrNull()

    // Checking if input for radius is valid
    if (radius == null || radius <= 0) {
        println("Invalid input for radius. Please enter a valid positive number.")
        return
    }

    println("Enter the height of the cylinder:")
    val height = readln().toDoubleOrNull()

    // Checking if input for height is valid
    if (height == null || height <= 0) {
        println("Invalid input for height. Please enter a valid positive number.")
        return
    }

    // Calculating the volume of the cylinder
    val volume = PI * radius * radius * height

    // Displaying the result
    println("The volume of the cylinder with radius $radius and height $height is: $volume")
}
