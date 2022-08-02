package com.brauny.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.brauny.compose.ui.theme.ComposeTheme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComponent()
        }
    }
}

@Composable
fun MyImage() {
    Image(painterResource(R.drawable.ic_launcher_foreground),
        "Android developer")
}

@Composable
fun MyText(text: String) {
    Text(text)
}

@Composable
fun MyComponent() {
    Row() {
        MyImage()
        MyTexts()
    }
}

@Composable
fun MyTexts() {
    Column() {
        MyText("Hola soy Francisco")
        MyText("Hola soy un programador")
    }
}

@Preview
@Composable
fun PreviewText() {
    MyComponent()
}