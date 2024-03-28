package com.vic.lennymobileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vic.lennymobileapp.ui.theme.LennyMobileAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LennyMobileAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .height(400.dp)
                        .padding(5.dp),


                    color = MaterialTheme.colorScheme.background
                ) {
                    HelloWorld("Lenny")
                }


            }
        }
    }
}
@Composable
fun HelloWorld( name:String) {
   Column() {
       Text(
           text = "Hey $name,Welcome back",
           fontSize = 16.sp,
           color = Color.Blue,
           fontFamily = FontFamily.SansSerif,
           fontStyle = FontStyle.Italic,
           textAlign = TextAlign.Center,
           modifier = Modifier
               .background(Color.Black)
               .padding(20.dp)
               .wrapContentHeight(align = Alignment.Top)
               .fillMaxWidth()
               .clip(shape = RoundedCornerShape(10.dp))


       )
       Spacer(modifier = Modifier.height(20.dp))
   TextFieldComponents()
       Spacer(modifier = Modifier.height(20.dp))
   TextFieldEmailComponents()
       Spacer(modifier = Modifier.height(20.dp))
   TextFieldLocationComponent()
       Spacer(modifier = Modifier.height(20.dp))
   Button(
       onClick = {},
       modifier = Modifier
           .fillMaxWidth()
           .padding(10.dp),
           colors =ButtonDefaults.buttonColors(Color.Cyan)) {
       Text(text = "Login Here")
       }
       Spacer(modifier = Modifier.height(20.dp))
   Button(onClick = {},
       modifier = Modifier
           .fillMaxWidth()
           .padding(10.dp),
       colors = ButtonDefaults.buttonColors(Color.Black)) {
       Text(text ="Register Here",
            color =Color.White)
   }


//       Text(
//           text = "$name is a Software Developer/Android Developer ",
//           fontSize = 23.sp,
//           color = Color.Green,
//           fontFamily = FontFamily.SansSerif,
//           fontStyle = FontStyle.Italic,
//           textAlign = TextAlign.Center,
//           modifier = Modifier.background(Color.Black)
//               .padding(20.dp)
//               .wrapContentHeight(align = Alignment.Top)
//       )
   }
}
@Preview(showSystemUi = true , showBackground = true)
@Composable
fun HelloWorldPreview() {
    HelloWorld("Lenny")
}

@Composable
fun TextFieldComponents(){
    var text by remember{
        mutableStateOf(value="")
    }
    TextField(modifier = Modifier.fillMaxWidth(),
        value = text, onValueChange = {
       newText -> text = newText
    },
        label ={Text(text = "Enter your Name")},
        placeholder ={
            Text(text ="Please Enter Your Name")
        })
}

@Composable
fun TextFieldEmailComponents(){
    var text by remember{
        mutableStateOf(value="")
    }
    TextField(modifier = Modifier.fillMaxWidth(),
        value = text, onValueChange = {
                newText -> text = newText
        },
        label ={Text(text = "Enter your Email")},
        placeholder ={
            Text(text ="Please enter your Email")
        })
}
@Composable
fun TextFieldLocationComponent(){
    var text by remember {
        mutableStateOf(value="")
    }
    TextField(modifier = Modifier.fillMaxWidth(),
        value = text, onValueChange = {
        newtext -> text =newtext
    },
        label ={ Text(text = "Enter your Location ")},
        placeholder = {
            Text(text = "Please Enter your Location")
        })
}



























