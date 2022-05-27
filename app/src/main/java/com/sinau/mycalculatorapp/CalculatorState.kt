package com.sinau.mycalculatorapp

/**
 * Created by Abika Chairul Yusri on 23/05/2022.
 */

// TODO: 4. Create State
data class CalculatorState (
    val number1: String = "",
    val number2: String = "",
    val operations: CalculatorOperations? = null
)