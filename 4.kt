//Write a program to calculate simple interest.

fun main() {
    // Prompting the user to enter principal amount
    println("Enter the principal amount:")
    val principal = readln().toDoubleOrNull()

    // Checking if input is valid
    if (principal == null || principal <= 0) {
        println("Invalid input for principal amount. Please enter a valid positive number.")
        return
    }

    // Prompting the user to enter rate of interest
    println("Enter the rate of interest (in percentage):")
    val rate = readln().toDoubleOrNull()

    // Checking if input is valid
    if (rate == null || rate <= 0) {
        println("Invalid input for rate of interest. Please enter a valid positive number.")
        return
    }

    // Prompting the user to enter time period in years
    println("Enter the time period (in years):")
    val time = readln().toDoubleOrNull()

    // Checking if input is valid
    if (time == null || time <= 0) {
        println("Invalid input for time period. Please enter a valid positive number.")
        return
    }

    // Calculating simple interest
    val simpleInterest = (principal * rate * time) / 100

    // Displaying the result
    println("Principal amount: $principal")
    println("Rate of interest: $rate%")
    println("Time period: $time years")
    println("Simple interest: $simpleInterest")
}

// Extension function to simplify readLine to readln
fun readln() = readLine()!!.trim()
