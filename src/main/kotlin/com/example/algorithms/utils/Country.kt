package com.example.algorithms.utils

//// used for the co-routine version
//import kotlinx.coroutines.async
//import kotlinx.coroutines.awaitAll
//import kotlinx.coroutines.coroutineScope

import com.example.algorithms.models.Country
import com.example.algorithms.models.City
import com.example.algorithms.models.Population

// non co-routine version
interface ICountryUtils {
    fun getCountryWithHighestPopulation(
        countries: List<Country>,
        cities: List<City>,
        populations: List<Population>
    ): String
}

class CountryUtils : ICountryUtils {
    override fun getCountryWithHighestPopulation(
        countries: List<Country>,
        cities: List<City>,
        populations: List<Population>
    ): String {
        // create a variable to store the name of the country with the highest population
        var countryNameWithHighestPopulation = ""

        // create a variable to store the population with the highest population
        var highestPopulation = 0

        // create a map where the key is a country name and the value is the population
        val countryToPopulationMap: MutableMap<String, Int> = mutableMapOf()

        // iterate over all countries
        for (country in countries) {
            // for each country, find cities with a matching id
            for (city in cities) {
                if (city.countryId == country.id) {
                    // for each city with a matching country ID, iterate over populations
                    for (population in populations) {
                        if (population.cityId == city.id) {
                            // for each population with a matching city ID:

                            // The MutableMap.merge will:
                            // if the country exists on the countryToPopulationMap, add current population to the matching country
                            // if the country does not exist on the countryToPopulationMap, add the key to the map and set the current population as the value
                            countryToPopulationMap.merge(
                                country.name,
                                population.amount
                            ) { existing, new -> existing + new }

                            // after setting the new population value, check if the current country's population is greater than the highestPopulation
                            // the ?.let { <lambda> } is a Safe call operator to avoid null pointer exceptions
                            countryToPopulationMap[country.name]?.let { currentPopulation ->
                                if (currentPopulation > highestPopulation) {
                                    // if so, override the countryNameWithHighestPopulation and highestPopulation
                                    highestPopulation = currentPopulation
                                    countryNameWithHighestPopulation = country.name
                                }
                            }
                        }
                    }
                }
            }
        }

        return countryNameWithHighestPopulation
    }
}

//// co-routine version
//interface ICountryUtils {
//    suspend fun getCountryWithHighestPopulation(
//        countries: List<Country>,
//        cities: List<City>,
//        populations: List<Population>
//    ): String
//}
//
//class CountryUtils : ICountryUtils {
//    override suspend fun getCountryWithHighestPopulation(
//        countries: List<Country>,
//        cities: List<City>,
//        populations: List<Population>
//    ) = coroutineScope {
//        // Create maps in parallel
//        val cityPopulations: Map<Int, Int> = populations.associate { it.cityId to it.amount }
//        val countryCities: Map<Int, List<City>> = cities.groupBy { it.countryId }
//
//        countries.chunked(100)
//            .map { chunk ->
//                async {
//                    chunk.map { country ->
//                        val citiesForCountry: List<City> = countryCities[country.id] ?: emptyList()
//
//                        val totalPopulation = citiesForCountry.sumOf { city: City ->
//                            cityPopulations[city.id] ?: 0
//                        }
//
//                        country.name to totalPopulation
//                    }
//                }
//            }
//            .awaitAll()
//            .flatten()
//            .maxByOrNull { it.second }
//            ?.first.orEmpty()
//    }
//}

// main function is not necessary unless you want to directly call the file in the command line etc
fun main() {
    println("Country Utils!")
}