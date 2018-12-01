package com.hagemajr.aoc2018.dailyChallenges

import java.io.File

val day = "20181201"

class Day1 {

    fun readSampleData(): String {
        val fileName = "src/main/resources/20181201.txt"

        return File(fileName).readText()

    }

}
