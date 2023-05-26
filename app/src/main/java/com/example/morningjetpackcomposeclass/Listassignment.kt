package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class Listassignment : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            cartoon()
        }
    }
}

@Composable
fun cartoon(){
    var scrollstate = rememberScrollState()
    Column(modifier = Modifier.fillMaxSize().verticalScroll(scrollstate)) {
        Row(modifier = Modifier.clip(RoundedCornerShape(10.dp))) {
            Image(painter = painterResource(id = R.drawable.tom), contentDescription = "tom",
                modifier = Modifier.size(height = 50.dp,width =  100.dp))
            Spacer(modifier = Modifier.width(5.dp))
            Column() {
                Text(text = "This is Tom", fontWeight = FontWeight.Bold)
                Text(text = "besides him is jerry")
                Text(text = "They run all day haha")
            }

        }
        Spacer(modifier = Modifier.width(30.dp))
        //second row
        Row(modifier = Modifier.clip(RoundedCornerShape(10.dp))) {
            Image(painter = painterResource(id = R.drawable.ben10), contentDescription = "tom",
                modifier = Modifier.size(height = 50.dp,width =  100.dp))
            Spacer(modifier = Modifier.width(5.dp))
            Column() {
                Text(text = "This is Ben", fontWeight = FontWeight.Bold)
                Text(text = "Most famous cartoon i guess haha")
                Text(text = "He has a nice watch ngl")
            }

        }
        Spacer(modifier = Modifier.width(30.dp))
        //third row
        Row(modifier = Modifier.clip(RoundedCornerShape(5.dp))) {
            Image(painter = painterResource(id = R.drawable.panda), contentDescription = "panda",
                modifier = Modifier.size(height = 50.dp,width =  100.dp))
            Spacer(modifier = Modifier.width(5.dp))
            Column() {
                Text(text = "This is Panda", fontWeight = FontWeight.Bold)
                Text(text = "he just minds business")
                Text(text = "kindest cartoon ever")
            }

        }
        Spacer(modifier = Modifier.width(30.dp))
        //fourth
        Row(modifier = Modifier.clip(RoundedCornerShape(10.dp))) {
            Image(painter = painterResource(id = R.drawable.mickey), contentDescription = "tom",
                modifier = Modifier.size(height = 50.dp,width =  100.dp))
            Spacer(modifier = Modifier.width(5.dp))
            Column() {
                Text(text = "This is Mickey the mouse", fontWeight = FontWeight.Bold)
                Text(text = "very mischevious cartoon")
                Text(text = "hot dog hot dog a digi sooooo")
            }

        }
        Spacer(modifier = Modifier.width(30.dp))
        //fifth
        Row(modifier = Modifier.clip(RoundedCornerShape(10.dp))) {
            Image(painter = painterResource(id = R.drawable.powerpuff), contentDescription = "tom",
            modifier = Modifier.size(height = 50.dp,width =  100.dp))
            Spacer(modifier = Modifier.width(5.dp))
            Column() {
                Text(text = "THE POWERPUFF GIRL", fontWeight = FontWeight.Bold)
                Text(text = "loves flying and stuff like that")
                Text(text = "runs all day haha")
            }

        }
        
    }
}

@Preview(showBackground = true)
@Composable
fun cartpre(){
    cartoon()
}
