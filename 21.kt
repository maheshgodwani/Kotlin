//Write a program that accept 5 numbers from user and find average of the value

fun main() {
    val numbers = mutableListOf<Double>()

    // Loop to prompt the user to enter 5 numbers
    for (i in 1..5) {
        println("Enter number $i:")
        val number = readln().toDoubleOrNull()

        // Checking if the input is valid
        if (number == null) {
            println("Invalid input. Please enter a valid number.")
            return
        }

        // Adding the valid number to the list
        numbers.add(number)
    }

    // Calculating the average
    val sum = numbers.sum()
    val average = sum / numbers.size

    // Displaying the result
    println("The average of the entered numbers is: $average")
}
