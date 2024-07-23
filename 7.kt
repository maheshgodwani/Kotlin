//Write a program to convert KM into Meter

fun main() {
    // Prompting the user to enter distance in kilometers
    println("Enter distance in kilometers:")
    val kilometers = readln().toDoubleOrNull()

    // Checking if input is valid
    if (kilometers == null || kilometers < 0) {
        println("Invalid input for kilometers. Please enter a valid non-negative number.")
        return
    }

    // Converting kilometers to meters
    val meters = kilometers * 1000

    // Displaying the result
    println("$kilometers kilometers is equal to $meters meters.")
}
