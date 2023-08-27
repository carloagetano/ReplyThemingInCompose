package com.example.reply.ui

/**
 * Coding challenge: Get number of vowel count.
 */
fun main() {
    println("Total number of vowels = " + getNumberOfVowelCount("hello world"))
    println("Total number of vowels = " + getNumberOfVowelCount("This is a sample sentence."))
    println("Total number of vowels = " + getNumberOfVowelCount("hjjkldsd"))
}

//my solution
fun getNumberOfVowelCount(input: String): Int {
    var count = 0

    for (char in input) {
        if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u') {
            count++
        }
    }

    return count
}

//shorter version of solution
fun getNumberOfVowelCount2(input: String) =
    input.toCharArray()
        .count { char -> char in "aeiou" }