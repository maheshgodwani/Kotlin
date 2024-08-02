//Write a program to swap two values without using third variable

fun main() {
    // Prompting the user to enter the first value
    println("Enter the first value:")
    var firstValue = readln().toDoubleOrNull()

    // Checking if input for first value is valid
    if (firstValue == null) {
        println("Invalid input for the first value. Please enter a valid number.")
        return
    }

    // Prompting the user to enter the second value
    println("Enter the second value:")
    var secondValue = readln().toDoubleOrNull()

    // Checking if input for second value is valid
    if (secondValue == null) {
        println("Invalid input for the second value. Please enter a valid number.")
        return
    }

    // Displaying the original values
    println("Before swapping:")
    println("First value: $firstValue")
    println("Second value: $secondValue")

    // Swapping the values without using a third variable
    firstValue = firstValue + secondValue
    secondValue = firstValue - secondValue
    firstValue = firstValue - secondValue

    // Displaying the swapped values
    println("After swapping:")
    println("First value: $firstValue")
    println("Second value: $secondValue")
}
