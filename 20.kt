//Write a program to convert negative to positive and positive to negative

fun main() {
    // Prompting the user to enter a number
    println("Enter a number:")
    val number = readln().toDoubleOrNull()

    // Checking if the input is valid
    if (number == null) {
        println("Invalid input. Please enter a valid number.")
        return
    }

    // Converting the number to its opposite sign
    val convertedNumber = -number

    // Displaying the result
    println("The converted number is: $convertedNumber")
}
