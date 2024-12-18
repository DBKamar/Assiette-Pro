package com.example.assiette_pto.responses

data class Recipe(
    var id: String = "", // Unique identifier for the recipe
    var name: String = "", // Name of the recipe
    var thumbnail: String = "", // Optional image URL or local path for the recipe
    var instructions: String = "", // Cooking instructions
    // Ingredients and measurements
    var ingredient1: String? = null,
    var ingredient2: String? = null,
    var ingredient3: String? = null,
    var ingredient4: String? = null,
    var ingredient5: String? = null,
    var ingredient6: String? = null,
    var ingredient7: String? = null,
    var ingredient8: String? = null,
    var ingredient9: String? = null,
    var ingredient10: String? = null,
    var ingredient11: String? = null,
    var ingredient12: String? = null,
    var ingredient13: String? = null,
    var ingredient14: String? = null,
    var ingredient15: String? = null,
    var ingredient16: String? = null,
    var ingredient17: String? = null,
    var ingredient18: String? = null,
    var ingredient19: String? = null,
    var ingredient20: String? = null,
    var measure1: String? = null,
    var measure2: String? = null,
    var measure3: String? = null,
    var measure4: String? = null,
    var measure5: String? = null,
    var measure6: String? = null,
    var measure7: String? = null,
    var measure8: String? = null,
    var measure9: String? = null,
    var measure10: String? = null,
    var measure11: String? = null,
    var measure12: String? = null,
    var measure13: String? = null,
    var measure14: String? = null,
    var measure15: String? = null,
    var measure16: String? = null,
    var measure17: String? = null,
    var measure18: String? = null,
    var measure19: String? = null,
    var measure20: String? = null,
    var isUserGenerated: Boolean = true // Flag indicating that this is a user-added recipe
) {
    // Explicit no-argument constructor for Firestore deserialization
    constructor() : this(
        id = "",
        name = "",
        thumbnail = "",
        instructions = "",
        ingredient1 = null,
        ingredient2 = null,
        ingredient3 = null,
        ingredient4 = null,
        ingredient5 = null,
        ingredient6 = null,
        ingredient7 = null,
        ingredient8 = null,
        ingredient9 = null,
        ingredient10 = null,
        ingredient11 = null,
        ingredient12 = null,
        ingredient13 = null,
        ingredient14 = null,
        ingredient15 = null,
        ingredient16 = null,
        ingredient17 = null,
        ingredient18 = null,
        ingredient19 = null,
        ingredient20 = null,
        measure1 = null,
        measure2 = null,
        measure3 = null,
        measure4 = null,
        measure5 = null,
        measure6 = null,
        measure7 = null,
        measure8 = null,
        measure9 = null,
        measure10 = null,
        measure11 = null,
        measure12 = null,
        measure13 = null,
        measure14 = null,
        measure15 = null,
        measure16 = null,
        measure17 = null,
        measure18 = null,
        measure19 = null,
        measure20 = null,
        isUserGenerated = true
    )
}
