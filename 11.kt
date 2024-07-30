//Write a program to calculate area and perimeter of the rectangle

fun main() {
    // Prompting the user to enter the length and width of the rectangle
    println("Enter the length of the rectangle:")
    val length = readln().toDoubleOrNull()

    // Checking if input for length is valid
    if (length == null || length <= 0) {
        println("Invalid input for length. Please enter a valid positive number.")
        return
    }

    println("Enter the width of the rectangle:")
    val width = readln().toDoubleOrNull()

    // Checking if input for width is valid
    if (width == null || width <= 0) {
        println("Invalid input for width. Please enter a valid positive number.")
        return
    }

    // Calculating the area of the rectangle
    val area = length * width

    // Calculating the perimeter of the rectangle
    val perimeter = 2 * (length + width)

    // Displaying the results
    println("The area of the rectangle with length $length and width $width is: $area")
    println("The perimeter of the rectangle with length $length and width $width is: $perimeter")
}

