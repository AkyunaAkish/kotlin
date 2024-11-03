package com.example.algorithms.testdata

import com.example.algorithms.models.Country
import com.example.algorithms.models.City
import com.example.algorithms.models.Population

val countries: List<Country> = listOf(
    Country(1, "USA"),
    Country(2, "Russia"),
    Country(3, "England"),
    Country(4, "Scotland"),
    Country(5, "Ireland"),
    Country(6, "Germany"),
    Country(7, "France"),
    Country(8, "Italy"),
    Country(9, "Finland")
)

val cities: List<City> = listOf(
    // USA (id: 1)
    City(1, "Denver", 1),
    City(2, "Boulder", 1),
    City(3, "Broomfield", 1),
    City(4, "Las Vegas", 1),

    // Russia (id: 2)
    City(5, "Moscow", 2),
    City(6, "Saint Petersburg", 2),
    City(7, "Novosibirsk", 2),

    // England (id: 3)
    City(8, "London", 3),
    City(9, "Manchester", 3),
    City(10, "Liverpool", 3),

    // Scotland (id: 4)
    City(11, "Edinburgh", 4),
    City(12, "Glasgow", 4),
    City(13, "Aberdeen", 4),

    // Ireland (id: 5)
    City(14, "Dublin", 5),
    City(15, "Cork", 5),
    City(16, "Galway", 5),

    // Germany (id: 6)
    City(17, "Berlin", 6),
    City(18, "Munich", 6),
    City(19, "Hamburg", 6),

    // France (id: 7)
    City(20, "Paris", 7),
    City(21, "Lyon", 7),
    City(22, "Marseille", 7),

    // Italy (id: 8)
    City(23, "Rome", 8),
    City(24, "Milan", 8),
    City(25, "Naples", 8),

    // Finland (id: 9)
    City(26, "Helsinki", 9),
    City(27, "Tampere", 9),
    City(28, "Turku", 9)
)

val populations: List<Population> = listOf(
    // USA Cities
    Population(1, 727211, 1),    // Denver
    Population(2, 105673, 2),    // Boulder
    Population(3, 74112, 3),     // Broomfield
    Population(4, 641903, 4),    // Las Vegas

    // Russia Cities
    Population(5, 12506468, 5),  // Moscow
    Population(6, 5351935, 6),   // Saint Petersburg
    Population(7, 1620162, 7),   // Novosibirsk

    // England Cities
    Population(8, 8982000, 8),   // London
    Population(9, 547627, 9),    // Manchester
    Population(10, 498042, 10),  // Liverpool

    // Scotland Cities
    Population(11, 524930, 11),  // Edinburgh
    Population(12, 633120, 12),  // Glasgow
    Population(13, 198590, 13),  // Aberdeen

    // Ireland Cities
    Population(14, 544107, 14),  // Dublin
    Population(15, 210000, 15),  // Cork
    Population(16, 79934, 16),   // Galway

    // Germany Cities
    Population(17, 3669495, 17), // Berlin
    Population(18, 1471508, 18), // Munich
    Population(19, 1841179, 19), // Hamburg

    // France Cities
    Population(20, 2148271, 20), // Paris
    Population(21, 516092, 21),  // Lyon
    Population(22, 861635, 22),  // Marseille

    // Italy Cities
    Population(23, 4342212, 23), // Rome
    Population(24, 1396059, 24), // Milan
    Population(25, 3084890, 25), // Naples

    // Finland Cities
    Population(26, 653835, 26),  // Helsinki
    Population(27, 238140, 27),  // Tampere
    Population(28, 192962, 28)   // Turku
)