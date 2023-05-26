package com.example.morningjetpackcomposeclass

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            text()
        }
    }
}

@Composable
fun text(){
    var mContext = LocalContext.current
   Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
       Text(text = "welcome to android",
           color = Color.Blue,
           fontSize = 30.sp,
           fontStyle = FontStyle.Italic,
           fontWeight = FontWeight.Bold,
           textDecoration = TextDecoration.Underline,



           )
       Button(onClick = {

           mContext.startActivity(Intent(mContext,Layoutactivity::class.java))
       }) {
           Text(text = "Layout")
       }
       Spacer(modifier = Modifier.height(20.dp))
       //second button
       Button(onClick = {

           mContext.startActivity(Intent(mContext,Imageactivity::class.java))
       },colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)) {
           Text(text = "Image",color = Color.Black)
       }
       Spacer(modifier = Modifier.height(20.dp))
       //third button
       Button(onClick = {

           mContext.startActivity(Intent(mContext,assignment::class.java))
       }) {
           Text(text = "assign")
       }
       Spacer(modifier = Modifier.height(20.dp))
       //fourth button
       Button(onClick = {

           mContext.startActivity(Intent(mContext,Textfieldactivity::class.java))
       }) {
           Text(text = "form")
       }
       Spacer(modifier = Modifier.height(20.dp))
        //fifth button
       Button(onClick = {

           mContext.startActivity(Intent(mContext,LIstactivity::class.java))
       }, shape = RectangleShape) {
           Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "tired")
           Text(text = "list")
       }
       Spacer(modifier = Modifier.height(20.dp))
       Button(onClick = {

           mContext.startActivity(Intent(mContext,CardActivity::class.java))
       }, shape = RectangleShape) {
           Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "tired")
           Text(text = "card")
       }


   }
}

@Preview(showBackground = true)
@Composable
fun textpreview(){
    text()
}