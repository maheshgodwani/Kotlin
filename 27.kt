//Write a program that accepts the year from user and check it leap year or not.

fun main() {
    // Prompting the user to enter a year
    println("Enter a year:")
    val year = readLine()?.toIntOrNull()

    // Checking if input for the year is valid
    if (year == null || year <= 0) {
        println("Invalid input for the year. Please enter a valid positive number.")
        return
    }

    // Checking if the year is a leap year
    val isLeapYear = if (year % 4 == 0) {
        if (year % 100 == 0) {
            year % 400 == 0
        } else {
            true
        }
    } else {
        false
    }

    // Displaying the result
    if (isLeapYear) {
        println("$year is a leap year.")
    } else {
        println("$year is not a leap year.")
    }
}
