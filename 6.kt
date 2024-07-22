//Write a program to calculate 10% bonus of salary.

fun main() {
    // Prompting the user to enter the salary
    println("Enter the salary:")
    val salary = readln().toDoubleOrNull()

    // Checking if input is valid
    if (salary == null || salary <= 0) {
        println("Invalid input for salary. Please enter a valid positive number.")
        return
    }

    // Calculating 10% bonus
    val bonus = 0.1 * salary

    // Displaying the result
    println("Salary: $salary")
    println("10% Bonus: $bonus")
}
