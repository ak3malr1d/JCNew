package com.example.jcnew.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jcnew.R
import com.example.jcnew.component.ButtonComponent
import com.example.jcnew.component.CheckboxComponent
import com.example.jcnew.component.ClickableLoginTextComponent
import com.example.jcnew.component.DividerTextComponent
import com.example.jcnew.component.HeadingTextComponent
import com.example.jcnew.component.MyTextFieldComponent
import com.example.jcnew.component.NormalTextComponent
import com.example.jcnew.component.PasswordFieldComponent
import com.example.jcnew.component.UnderLineTextComponent
import com.example.jcnew.navigation.PostOfficeAppRouter
import com.example.jcnew.navigation.Screen
import com.example.jcnew.navigation.SystemBackButtonHandler
import com.example.jcnew.component.HeadingTextComponent
import com.example.jcnew.component.NormalTextComponent

@Composable
fun LoginScreen(){

    Surface (
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)
            .background(Color.White)
    ){
        Column {
            NormalTextComponent(value = stringResource(id = R.string.login))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))

            Spacer(modifier = Modifier.height(20.dp))


            MyTextFieldComponent(labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.email),
                onTextSelected = {

                })
            PasswordFieldComponent(labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.lock),
                onTextSelected = {

                })

            Spacer(modifier = Modifier.height(40.dp))

            UnderLineTextComponent(value = stringResource(id = R.string.forgot_password))

            Spacer(modifier = Modifier.height(80.dp))

            ButtonComponent(value = stringResource(id = R.string.login))

            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = false, onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
            })


        }

    }

    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
    }

}



@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}