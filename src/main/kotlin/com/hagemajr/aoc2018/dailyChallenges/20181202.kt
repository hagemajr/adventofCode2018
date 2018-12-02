package com.hagemajr.aoc2018.dailyChallenges

import java.io.File

class Day2(private val fileName: String) {

    private var boxIds = listOf<String>()

    fun readSampleData(): List<String> {
        boxIds = File(fileName).readLines()
        return boxIds
    }

    fun countRepeats(): Int {
        var twoCounts = 0
        var threeCounts = 0
        boxIds.forEach {
            val charCounts = countCharacters(it)
            twoCounts += if (charCounts.filter { it.value == 2 }.count() > 0) 1 else 0
            threeCounts += if (charCounts.filter { it.value == 3 }.count() > 0) 1 else 0
        }
        return twoCounts * threeCounts
    }

    fun findPrototypeFabricBoxes(): String? {
        var diff: Int
        var idx = -1
        boxIds.forEach { i ->
            boxIds.filter { it != i }.forEach loop@{ j ->
                diff = 0
                j.forEachIndexed { index, _ ->
                    if (i[index] != j[index]) {
                        diff += 1
                        idx = index
                        if (diff > 1)
                            return@loop
                    }
                }
                return i.filterIndexed { index, _ -> index != idx }
            }
        }
        return null
    }


    private fun countCharacters(str: String): Map<Char, Int> {
        val charCounts = mutableMapOf<Char, Int>()
        str.forEach { c ->
            charCounts[c] = charCounts.getOrDefault(c, 0) + 1
        }
        return charCounts
    }
}
