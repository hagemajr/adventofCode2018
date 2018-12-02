package com.hagemajr.aoc2018.dailyChallenges

import java.io.File

class Day1(private val fileName: String) {

    private var frequencies = listOf<Int>()

    fun readSampleData(): List<Int> {
        frequencies = File(fileName).readLines().map { it.toInt() }
        return frequencies
    }

    fun calculateFirstFrequency(): Int {
        return frequencies.sum()
    }

    fun findSecondCommonFrequency(): Int {
        val freqMap = mutableMapOf<Int, Int>()
        var currentSum = frequencies.fold(0) { sum, element ->
            freqMap[sum + element] = 1
            sum + element
        }
        while (freqMap.maxBy { it.value }!!.value == 1) {
            frequencies.forEach {
                if (freqMap.containsKey(currentSum + it)) {
                    freqMap[currentSum + it] = 2
                    return@forEach
                } else {
                    freqMap[currentSum + it] = 1
                }
                currentSum += it
            }
        }
        return freqMap.maxBy { it.value }!!.key
    }

}
