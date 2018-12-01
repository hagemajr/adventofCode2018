package com.hagemajr.aoc2018

import com.hagemajr.aoc2018.dailyChallenges.Day1
import java.io.File


fun main(args: Array<String>) {
    println("Day 1:")
    println("===============")
    with(Day1("src/main/resources/20181201.txt")){
        readSampleData()
        println("First Frequency is : ${calculateFirstFrequency()}")
        println("First Common Frequency is: ${findSecondCommonFrequency()}")
    }
    println("===============")
}
