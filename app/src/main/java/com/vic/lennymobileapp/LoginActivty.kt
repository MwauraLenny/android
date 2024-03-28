package com.vic.lennymobileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vic.lennymobileapp.ui.theme.LennyMobileAppTheme

class LoginActivty : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LennyMobileAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()

                }
            }
        }
    }
}
@Composable
fun LoginScreen(){
    Column {
    TextComponent()
    Spacer(modifier = Modifier.height(20.dp))
    TextFieldnameComponents()
    Spacer(modifier = Modifier.height(20.dp))
    TextEmailComponents()
    Spacer(modifier = Modifier.height(20.dp))
    Password()
        Button(onClick ={}) {
            Text(text = "Login Here")
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}

@Composable
fun TextComponent(){
    Text(text = "Login here")
}

@Composable
fun TextFieldnameComponents() {
    var text by remember {
        mutableStateOf(value = "")
    }
    TextField(value = text, onValueChange = { newText ->
        text = newText
    },
        label = { Text(text = " Enter Your Username") },
        placeholder = {
            Text(text = "PLease Enter your Username")
        }
    )
}

@Composable
fun TextEmailComponents(){
    var text by remember {
        mutableStateOf(value = "")
}
    TextField(value =text , onValueChange = {
    newText -> text = newText
    },
        label ={ Text(text = "Enter Your Email")},
        placeholder = {Text(text ="Please Enter yor Email")
        }
    )

}

@Composable
fun Password(){
    var text by remember {
        mutableStateOf(value="")
    }
    TextField(value = text, onValueChange ={
        newtext -> text =newtext
    },
        label ={ Text(text = "Enter your Password")},
        placeholder = { Text(text = "Please enter your password")}
    )
}


