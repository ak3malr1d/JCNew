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
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jcnew.R
import com.example.jcnew.component.ButtonComponent
import com.example.jcnew.component.CheckboxComponent
import com.example.jcnew.component.ClickableLoginTextComponent
import com.example.jcnew.component.DividerTextComponent
import com.example.jcnew.component.HeadingTextComponent
import com.example.jcnew.component.MyTextFieldComponent
import com.example.jcnew.component.NormalTextComponent
import com.example.jcnew.component.PasswordFieldComponent
import com.example.jcnew.data.LoginViewModel
import com.example.jcnew.data.UIEvent
import com.example.jcnew.navigation.PostOfficeAppRouter
import com.example.jcnew.navigation.Screen

@Composable
fun SignUpScreen(loginViewModel: LoginViewModel = viewModel()){

    Surface (
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)
            .background(Color.White)
    ){
        Column {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))

            Spacer(modifier = Modifier.height(20.dp))

            MyTextFieldComponent(labelValue = stringResource(id = R.string.first_name),
                painterResource = painterResource(id = R.drawable.person),
                onTextSelected = {
                    loginViewModel.onEvent(UIEvent.FirstNameChanged(it))
                })
            MyTextFieldComponent(labelValue = stringResource(id = R.string.last_name),
                painterResource = painterResource(id = R.drawable.person),
                onTextSelected = {
                    loginViewModel.onEvent(UIEvent.LastNameChanged(it))
                })
            MyTextFieldComponent(labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.email),
                onTextSelected = {
                    loginViewModel.onEvent(UIEvent.EmailChanged(it))
                })
            PasswordFieldComponent(labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.lock),
                onTextSelected = {
                    loginViewModel.onEvent(UIEvent.PasswordChanged(it))
                })

            CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions),
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                })
            Spacer(modifier = Modifier.height(40.dp))

            ButtonComponent(value = stringResource(id = R.string.register))

            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.LoginScreen)
            })


        }

    }

}


@Preview(showBackground = true)
@Composable
fun SignUpScreenPreview(){
    SignUpScreen()
}