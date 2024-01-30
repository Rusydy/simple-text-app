package com.learn.simple_text_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                color = MaterialTheme.colorScheme.background
            ) {
                GreetingImage(
                    message = "Happy Birthday",
                    from = "Android"
                )
            }
        }
    }
}



@Composable
fun GreetingText(
    message: String,
    from: String,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = message,
            fontSize = 90.sp,
            lineHeight = 100.sp,
            textAlign = TextAlign.Center,
            modifier = modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = from,
            fontSize = 36.sp,
            textAlign = TextAlign.Right,
            modifier = modifier
                .padding(end = 16.dp)
                .align(Alignment.End)
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)

    Box {
        Image(
            painter = image,
            contentDescription = "Android Party",
            modifier = modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        GreetingText(
            message = message,
            from = from,
            modifier = modifier
                .padding(8.dp)
        )
    }
}

@Preview
@Composable
fun BirthdayCardPreview() {
    GreetingImage(
        message = "Happy Birthday Sam!",
        from = "From Android"
    )
}


