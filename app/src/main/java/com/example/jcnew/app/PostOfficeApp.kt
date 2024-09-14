package com.example.jcnew.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.jcnew.navigation.PostOfficeAppRouter
import com.example.jcnew.navigation.Screen
import com.example.jcnew.screen.LoginScreen
import com.example.jcnew.screen.SignUpScreen
import com.example.jcnew.screen.TermsAndConditionsScreen

@Composable
fun PostOfficeApp() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Crossfade(targetState = PostOfficeAppRouter.currentScreen, label = "") { currentState ->
            when (currentState.value) {
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }

                is Screen.TermsAndConditionsScreen -> {
                    TermsAndConditionsScreen()
                }

                is Screen.LoginScreen -> {
                    LoginScreen()
                }


            }

        }
    }
}