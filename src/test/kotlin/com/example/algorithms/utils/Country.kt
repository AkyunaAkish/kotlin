// non-coroutine option
package com.example.algorithms.utils

// used by the co-routine version
//import kotlin.test.Test
//import kotlin.test.assertEquals
//import kotlinx.coroutines.test.runTest

import com.example.algorithms.testdata.countries
import com.example.algorithms.testdata.cities
import com.example.algorithms.testdata.populations

import kotlin.test.Test
import kotlin.test.assertEquals

class CountryUtilsTest {
    @Test
    fun testCountryWithHighestPopulation() {
        val countryUtils = CountryUtils()

        assertEquals(
            "Russia",
            countryUtils.getCountryWithHighestPopulation(countries, cities, populations),
            "Should return the country with the highest population"
        )
    }
}

//// co-routine option
//class CountryUtilsTest {
//    @Test
//    fun testCountryWithHighestPopulation() = runTest {  // Change to runTest
//        val countryUtils = CountryUtils()
//
//        assertEquals(
//            "Russia",
//            countryUtils.getCountryWithHighestPopulation(countries, cities, populations),
//            "Should return the country with the highest population"
//        )
//    }
//}