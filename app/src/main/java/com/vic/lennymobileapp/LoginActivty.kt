package com.vic.lennymobileapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                   Column {
                       LoginScreen()
                       Spacer(modifier = Modifier.height(20.dp))
                       Button(
                           onClick ={},
                           modifier = Modifier
                               .fillMaxWidth()
                               .padding(10.dp),
                           colors = ButtonDefaults.buttonColors(Color.Cyan)) {
                           Text(text = "Login Here")
                       }
                       Button(onClick = {
                           val intent = Intent(this@LoginActivty,MainActivity::class.java)
                           startActivity(intent)
                       },
                           modifier = Modifier
                               .fillMaxWidth()
                               .padding(10.dp),
                           colors = ButtonDefaults.buttonColors(Color.Black)) {
                           Text(text ="Register Here",
                               color = Color.White)
                       }
                   }
                }
            }
        }
    }
}
@Composable
fun LoginScreen(){
    Column {
        Text(text = "Login Here",
            textAlign = TextAlign.Center,
            color = Color.Red,
            fontFamily = FontFamily.Serif,
            fontSize = 20.sp
        modifier)


    Spacer(modifier = Modifier.height(20.dp))
        ImageComponent()

    TextFieldnameComponents()
    Spacer(modifier = Modifier.height(20.dp))
    TextEmailComponents()
    Spacer(modifier = Modifier.height(20.dp))

    Spacer(modifier = Modifier.height(20.dp))

    Spacer(modifier = Modifier.height(20.dp))




        }
    }


@Preview(showSystemUi = true , showBackground = true )
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}

@Composable
fun TextFieldnameComponents() {
    var text by remember {
        mutableStateOf(value = "")
    }
    TextField(modifier = Modifier.fillMaxWidth(),
        value = text, onValueChange = { newText ->
        text = newText
    },
        label = { Text(text = " Enter Your Username") },
        placeholder = {
            Text(text = "Please Enter your Username")
        }
    )
}

@Composable
fun TextEmailComponents(){
    var text by remember {
        mutableStateOf(value = "")
}
    TextField(modifier = Modifier.fillMaxWidth(),
    value =text , onValueChange = {
    newText -> text = newText
    },
        label ={ Text(text = "Enter Your Email")},
        placeholder = {Text(text ="Please Enter yor Email")
        }
    )

}

//@Composable
//fun PasswordTextField() {
//    var password by rememberSaveable { mutableStateOf("") }
//    var passwordVisibility by remember { mutableStateOf(false) }
//
//    val Icon = if (passwordVisibility)
//        painterResource(id = R.drawable.design_ic_visibility)
//    else
//        painterResource(id = R.drawable.design_ic_visibility_off)
//
//    OutlinedTextField(
//        modifier = Modifier.fillMaxSize(),
//        value = password,
//        onValueChange = {
//            password = it
//        },
//        placeholder = {Text(text = "Password") },
//        label = {Text(text = "Password") },
//        trailingIcon = {
//            IconButton(onClick = { passwordVisibility = !passwordVisibility })
//            {
//                Icon(
//                    painter = Icon,
//                    contentDescription = "Visibility Icon"
//                )
//            }
//        },
//        keyboardOptions = KeyboardOptions(
//            keyboardType = KeyboardType.Password
//        ),
//
//        KeyboardOptions = KeyboardOptions(
//            keyboardType = KeyboardType.Password
//        ),
//        VisualTransformation = if (passwordVisibility) VisualTransformation.None
//        else PasswordVisualTransformation()
//    )
//
//}
@Composable
fun ImageComponent(){
    Image(modifier = Modifier
        .wrapContentHeight()
        .fillMaxWidth()
        .height(80.dp),
        painter = painterResource(id = R.drawable.img),
        contentDescription = "My Logo")
}





