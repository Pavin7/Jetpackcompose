package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class assignment : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                asin()
        }
    }
}

@Composable

fun asin(){
     Column(modifier = Modifier.fillMaxSize().background(color = Color.DarkGray)) {
         Image(painter = painterResource(id = R.drawable.pizza), contentDescription = "nice")
         Text(text = "Homemade veg pizza", fontSize = 30.sp, color = Color.Blue, fontWeight = FontWeight.Bold)
         Text(text = "Italian food is delicious,please dont put tomatoe in the pasta pleaaase", color = Color.White)
     }
}

@Preview(showBackground = true)
@Composable
fun asinpre(){
    asin()
}
