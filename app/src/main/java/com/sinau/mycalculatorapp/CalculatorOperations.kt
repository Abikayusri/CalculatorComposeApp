package com.sinau.mycalculatorapp

/**
 * Created by Abika Chairul Yusri on 23/05/2022.
 */

sealed class CalculatorOperations(val symbol: String) {
    object Add : CalculatorOperations("+")
    object Subtract : CalculatorOperations("-")
    object Multiply : CalculatorOperations("x")
    object Divide : CalculatorOperations("/")
}
