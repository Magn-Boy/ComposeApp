package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.ComposeArticleTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme{
                Surface(color = MaterialTheme.colors.background){
                    ComposeArticleApp()
                }
            }
        }
    }
}

@Composable
fun ComposeArticleApp(){
    ArticleCard(
        jetpack = stringResource(R.string.jetpack),
        shortText = stringResource(R.string.short_text),
        longText = stringResource(R.string.long_text),
        imagePrinter = painterResource(R.drawable.bg_compose_background)
    )
}

@Composable
fun ArticleCard(
    jetpack: String,
    shortText: String,
    longText: String,
    imagePrinter: Painter,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier) {
        Image(
            painter = imagePrinter,
            contentDescription = null
        )
        Text(
            text = jetpack,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = shortText,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = longText,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview
@Composable
fun ComposeArticleAppPreview(){
    ComposeArticleTheme{
        Surface {
            ComposeArticleApp()
        }
    }
}

