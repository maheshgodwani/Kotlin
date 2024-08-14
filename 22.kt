//Write a program to find out the net salary of an employee and get the basic salary fromhim.
//Applicable TA 4%, DA 30%, HRA 15% on basic salary. Applicable 3% tax 12% PF on basic salary

fun main() {
    // Prompting the user to enter the basic salary
    println("Enter the basic salary:")
    val basicSalary = readLine()?.toDoubleOrNull()

    // Checking if input for basic salary is valid
    if (basicSalary == null || basicSalary <= 0) {
        println("Invalid input for basic salary. Please enter a valid positive number.")
        return
    }

    // Constants for allowances and deductions percentages
    val taPercentage = 0.04  // TA (Transport Allowance) is 4% of basic salary
    val daPercentage = 0.30  // DA (Dearness Allowance) is 30% of basic salary
    val hraPercentage = 0.15 // HRA (House Rent Allowance) is 15% of basic salary
    val taxPercentage = 0.03 // Tax is 3% of basic salary
    val pfPercentage = 0.12  // PF (Provident Fund) is 12% of basic salary

    // Calculating allowances
    val ta = basicSalary * taPercentage
    val da = basicSalary * daPercentage
    val hra = basicSalary * hraPercentage

    // Calculating deductions
    val tax = basicSalary * taxPercentage
    val pf = basicSalary * pfPercentage

    // Calculating net salary
    val grossSalary = basicSalary + ta + da + hra
    val deductions = tax + pf
    val netSalary = grossSalary - deductions

    // Displaying the breakdown and net salary
    println("Basic Salary: $basicSalary")
    println("TA (4%): $ta")
    println("DA (30%): $da")
    println("HRA (15%): $hra")
    println("Tax (3%): $tax")
    println("PF (12%): $pf")
    println("Gross Salary: $grossSalary")
    println("Total Deductions: $deductions")
    println("Net Salary: $netSalary")
}
