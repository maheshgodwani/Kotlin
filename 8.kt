//The distance between two cities is input through keyboard. Write a program to convertand print
//this distance in feet, meter, inch and centimeter

fun main() {
    // Prompting the user to enter distance in kilometers
    println("Enter distance between two cities in kilometers:")
    val kilometers = readln().toDoubleOrNull()

    // Checking if input is valid
    if (kilometers == null || kilometers < 0) {
        println("Invalid input for kilometers. Please enter a valid non-negative number.")
        return
    }

    // Conversion factors
    val feetPerKilometer = 3280.84   // 1 kilometer = 3280.84 feet
    val metersPerKilometer = 1000.0  // 1 kilometer = 1000 meters
    val inchesPerKilometer = 39370.1  // 1 kilometer = 39370.1 inches
    val centimetersPerKilometer = 100000.0  // 1 kilometer = 100000 centimeters

    // Converting kilometers to other units
    val feet = kilometers * feetPerKilometer
    val meters = kilometers * metersPerKilometer
    val inches = kilometers * inchesPerKilometer
    val centimeters = kilometers * centimetersPerKilometer

    // Displaying the result
    println("$kilometers kilometers is equal to:")
    println("Feet: $feet")
    println("Meters: $meters")
    println("Inches: $inches")
    println("Centimeters: $centimeters")
}
