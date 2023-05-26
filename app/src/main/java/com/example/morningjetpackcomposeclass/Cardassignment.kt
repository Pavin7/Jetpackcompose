package com.example.morningjetpackcomposeclass

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class Cardassignment : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                     cardasin()
        }
    }
}

@Composable
fun cardasin(){
    var mContext = LocalContext.current
    Column( modifier = Modifier.fillMaxWidth() ,horizontalAlignment = Alignment.CenterHorizontally) {

            Card(modifier = Modifier
                .background(color = Color.Cyan)
                .padding(20.dp)) {
                Text(text = "ADIDAS")

                Image(painter = painterResource(id = R.drawable.adidas), contentDescription = "adidas")
                Button(onClick = {

                    mContext.startActivity(Intent(mContext,CardActivity::class.java))
                }, shape = RectangleShape) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "assin")
                    Text(text = "card")
                }


            }

        Spacer(modifier = Modifier.height(10.dp))
        //card 2
        Card(modifier = Modifier
            .background(color = Color.Yellow)
            .padding(20.dp)) {
            Text(text = "NIKE")
            Image(painter = painterResource(id = R.drawable.nike), contentDescription = "NIKE")
        }
        Spacer(modifier = Modifier.height(10.dp))
        //card 3
        Card(modifier = Modifier
            .background(color = Color.White)
            .padding(20.dp)) {
            Text(text = "PUMA")
            Image(painter = painterResource(id = R.drawable.puma), contentDescription = "PUMA")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun cardio(){
    cardasin()
}
