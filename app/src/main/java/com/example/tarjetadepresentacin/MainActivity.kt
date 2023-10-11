package com.example.tarjetadepresentacin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetadepresentacin.ui.theme.TarjetaDePresentaciónTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentaciónTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //
                }
            }
        }
    }
}

@Composable
fun name(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //
        Column {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null,
                Modifier
                    .height(120.dp)
                    .background(Color.Black)
                    .padding(10.dp)
                    .align(alignment = Alignment.CenterHorizontally)
                )
                Text(
                    text = "Roberto Mejia Osorio",
                    textAlign = TextAlign.Center,
                    fontSize = 40.sp
                )
                Text(
                    text = "Android Desarrollador Extraordinario!",
                    Modifier
                        .align(alignment = Alignment.CenterHorizontally),
                    color = Color.Green,
                    )
            }
        Column(
            modifier = modifier,

        ) {
                Row {

                }
        }
    }
}


@Preview(showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    TarjetaDePresentaciónTheme {
        //
        name()
    }
}