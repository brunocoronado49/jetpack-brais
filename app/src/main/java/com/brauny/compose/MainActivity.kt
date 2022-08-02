package com.brauny.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
            ComposeTheme() {
                MyComponent()
            }
        }
    }
}

@Composable
fun MyImage() {
    Image(
        painterResource(R.drawable.ic_launcher_foreground),
        "Android developer",
        modifier = Modifier
            .clip(CircleShape)
            .background(MaterialTheme.colors.primary)
            .size(64.dp)
    )
}

@Composable
fun MyText(text: String) {
    Text(text)
}

@Composable
fun MyComponent() {
    Row(
        modifier = Modifier.padding(8.dp)
    ) {
        MyImage()
        MyTexts()
    }
}

@Composable
fun MyTexts() {
    Column(
        modifier = Modifier.padding(start = 8.dp)
    ) {
        MyText("Hola soy Francisco")
        Spacer(modifier = Modifier.height(16.dp))
        MyText("Hola soy un programador")
    }
}

@Preview
@Composable
fun PreviewText() {
    ComposeTheme() {
        MyComponent()
    }
}