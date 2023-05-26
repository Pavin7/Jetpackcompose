package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           card()
        }
    }
}

@Composable
fun card(){
    var scrollstate = rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollstate),
    horizontalAlignment = Alignment.CenterHorizontally) {
       Card(modifier = Modifier
           .background(color = Color.Gray)
           .padding(20.dp)) {
           Text(text = "Bulldog")
           Image(painter = painterResource(id = R.drawable.bulldog), contentDescription = "dog",
               modifier = Modifier
                   .size(width = 50.dp, height = 50.dp)
                   .clip(shape = CircleShape))
       }

        Spacer(modifier = Modifier.height(10.dp))
        //second card
        Card(modifier = Modifier
            .background(color = Color.Gray)
            .padding(20.dp)) {
            Text(text = "German shepherd")
            Image(painter = painterResource(id = R.drawable.shepherd), contentDescription = "dog",
                modifier = Modifier
                    .size(width = 50.dp, height = 50.dp)
                    .clip(shape = CircleShape))
        }

        Spacer(modifier = Modifier.height(10.dp))
        //third card
        Card(modifier = Modifier
            .background(color = Color.Gray)
            .padding(20.dp)) {
            Text(text = "huskey")
            Image(painter = painterResource(id = R.drawable.huskey), contentDescription = "dog",
                modifier = Modifier
                    .size(width = 50.dp, height = 50.dp)
                    .clip(shape = CircleShape))
        }

    }
}

@Preview(showBackground = true)
@Composable 
fun cardprev(){
    card()
}
