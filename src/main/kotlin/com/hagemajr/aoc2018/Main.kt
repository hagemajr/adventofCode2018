package com.hagemajr.aoc2018

import com.hagemajr.aoc2018.dailyChallenges.*


fun main(args: Array<String>) {
    println("Day 1:")
    println("===============")
    with(Day1("src/main/resources/20181201.txt")) {
        readSampleData()
        println("First Frequency is : ${calculateFirstFrequency()}")
        println("First Common Frequency is: ${findSecondCommonFrequency()}")
    }
    println("===============")

    println("Day 2:")
    println("===============")
    with(Day2("src/main/resources/20181202.txt")) {
        readSampleData()
        println("The product of two's and three's is ${countRepeats()}")
        findPrototypeFabricBoxes()?.let { println("The common string is $it") }
    }
    println("===============")
}
