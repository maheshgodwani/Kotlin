//Write a program to calculate compound interest

import kotlin.math.pow

fun main() {
    // Accepting principal amount, rate of interest, time period, and number of times interest applied per year
    println("Enter the principal amount: ")
    val principal = readLn().toDouble()

    println("Enter the annual interest rate (as a decimal): ")
    val rate = readLn().toDouble()

    println("Enter the number of years: ")
    val years = readLn().toInt()

    println("Enter the number of times interest applied per year: ")
    val n = readLn().toInt()

    // Calculating compound interest
    val amount = principal * (1 + rate / n).pow(n * years)

    // Calculating interest
    val interest = amount - principal

    // Printing the result
    println("After $years years at an interest rate of ${rate * 100}% compounded $n times per year, the investment will be worth $amount")
    println("Compound interest earned: $interest")
}

// Extension function to simplify readLine to readLn
fun readLn() = readLine()!!.trim()
