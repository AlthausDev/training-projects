package com.example.atp03_composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atp03_composearticle.ui.theme.ATP03ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ATP03ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Cabecera()
                }
            }
        }
    }
}

@Composable
fun Cabecera(){
    val img = painterResource(id = R.drawable.bg_compose_background)
    Image(
        painter = img,
        contentDescription ="Img cabecera"
    )
}

@Composable
fun Cuerpo(title: String, texto1:String, texto2: String, modifier: Modifier = Modifier) {

    Column (
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            textAlign = TextAlign.Justify
            )
        Text(
            text = texto1,
            textAlign = TextAlign.Justify
        )
        Text(
            text = texto2,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ATP03ComposeArticleTheme {
        Cabecera()
        Cuerpo("Jetpack Compose tutorial",
            """Jetpack Compose is a modern toolkit for building native Android UI. Compose 
                simplifies and accelerates UI development on Android with less code, powerful tools,
                 and intuitive Kotlin APIs.""",
                """In this tutorial, you build a simple UI component with declarative functions. 
                    You call Compose functions to say what elements you want and the Compose compiler 
                    does the rest. Compose is built around Composable functions. These functions let 
                    you define your app\'s UI programmatically because they let you describe how it 
                    should look and provide data dependencies, rather than focus on the process of 
                    the UI\'s construction, such as initializing an element and then attaching it to 
                    a parent. To create a Composable function, you add the @Composable annotation to 
                    the function name.""")
    }
}