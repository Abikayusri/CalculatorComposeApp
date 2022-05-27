package com.sinau.mycalculatorapp

/**
 * Created by Abika Chairul Yusri on 23/05/2022.
 */

// TODO: 2. Create actions
sealed class CalculatorActions {
    data class Number(val number: Int) : CalculatorActions()
    object Clear : CalculatorActions()
    object Delete : CalculatorActions()
    object Calculate : CalculatorActions()
    object Decimal : CalculatorActions()
    data class Operation(val operation: CalculatorOperations) : CalculatorActions()
}
