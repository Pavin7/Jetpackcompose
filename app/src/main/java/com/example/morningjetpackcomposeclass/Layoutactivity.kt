package com.example.morningjetpackcomposeclass

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class Layoutactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    mytext()

        }
    }
}

@Composable
fun mytext(){
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Hello there", fontSize = 40.sp, fontStyle = androidx.compose.ui.text.font.FontStyle.Italic, color = Color.Green)
        Text(text = "you again", fontSize = 40.sp, fontStyle = androidx.compose.ui.text.font.FontStyle.Italic, color = Color.Green)

        Row(modifier = Modifier.fillMaxWidth().background(color = Color.Blue)){
            Text(text = "yes", fontSize = 30.sp, fontStyle = androidx.compose.ui.text.font.FontStyle.Italic, color = Color.Red )
            Text(text = "no",fontSize = 30.sp, fontStyle = androidx.compose.ui.text.font.FontStyle.Italic, color = Color.Red )
        }

    }

}


@Preview(showBackground = true)
@Composable
fun prec(){
    mytext()
}
