package com.vic.lennymobileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.vic.lennymobileapp.ui.theme.LennyMobileAppTheme

class BackgroundActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LennyMobileAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen(){
    Box (
        modifier = Modifier.fillMaxSize()
    ){
      Image(painter = painterResource(id = R.drawable.butterfly),
          contentDescription ="Butterfly",
          contentScale = ContentScale.FillBounds,
          modifier = Modifier.matchParentSize())
    }
}
@Preview(showSystemUi = true , showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}