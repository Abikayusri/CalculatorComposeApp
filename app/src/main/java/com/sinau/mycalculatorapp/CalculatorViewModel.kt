package com.sinau.mycalculatorapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

/**
 * Created by Abika Chairul Yusri on 23/05/2022.
 */

class CalculatorViewModel : ViewModel() {

    var state by mutableStateOf(CalculatorState())
        private set


}