//Write a program to swap two values

fun main() {
    // Prompting the user to enter the first value
    println("Enter the first value:")
    var firstValue = readln()

    // Prompting the user to enter the second value
    println("Enter the second value:")
    var secondValue = readln()

    // Displaying the original values
    println("Before swapping:")
    println("First value: $firstValue")
    println("Second value: $secondValue")

    // Swapping the values
    val temp = firstValue
    firstValue = secondValue
    secondValue = temp

    // Displaying the swapped values
    println("After swapping:")
    println("First value: $firstValue")
    println("Second value: $secondValue")
}
