package com.example.jcnew.data

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private var TAG = LoginViewModel::class.simpleName
    private var registrationUIState = mutableStateOf(RegistrationUIState())

    fun onEvent(event: UIEvent){
        when(event){
            is UIEvent.FirstNameChanged -> {
                registrationUIState.value = registrationUIState.value.copy(
                    firstName = event.firstName
                )
                printState()
            }
            is UIEvent.LastNameChanged -> {
                registrationUIState.value = registrationUIState.value.copy(
                    lastName = event.lastName
                )
                printState()
            }
            is UIEvent.EmailChanged -> {
                registrationUIState.value = registrationUIState.value.copy(
                    email = event.email
                )
                printState()
            }
            is UIEvent.PasswordChanged -> {
                registrationUIState.value = registrationUIState.value.copy(
                    password = event.password
                )
                printState()
            }
        }
    }

    private fun printState(){
        Log.d(TAG, "inside printState")
        Log.d(TAG, registrationUIState.value.toString())

    }
}