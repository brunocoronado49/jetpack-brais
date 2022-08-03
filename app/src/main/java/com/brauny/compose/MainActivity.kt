package com.brauny.compose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.ui.text.TextStyle
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
            // Le añadimos el tema que tenemos por defecto
            ComposeTheme() {
                MyComponent()
            }
        }
    }
}

@Composable
fun MyImage() {
    // Se modificara dependiendo de lo que vaya primero
    Image(
        painterResource(R.drawable.ic_launcher_foreground),
        "Android developer",
        modifier = Modifier
            .clip(CircleShape)
            .background(Color.Red)
            .size(64.dp)
    )
}

@Composable
fun MyText(text: String, color: Color, style: TextStyle) {
    Text(text, color = color, style = style)
}

@Composable
fun MyComponent() {
    // Se modifica dentro del componente y antes del cuearpo de los componentes
    Row(
        modifier = Modifier.background(MaterialTheme.colors.onBackground).padding(8.dp)
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
        MyText("Hola soy Francisco",
            MaterialTheme.colors.primary,
            MaterialTheme.typography.subtitle1
        )

        // Añade un espacio entre cada componente
        Spacer(modifier = Modifier.height(16.dp))
        MyText("Hola soy un programador",
            MaterialTheme.colors.secondary,
            MaterialTheme.typography.subtitle2
        )
    }
}

// Para ver el tema oscuro pasar este parametro a la preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewText() {
    ComposeTheme() {
        MyComponent()
    }
}