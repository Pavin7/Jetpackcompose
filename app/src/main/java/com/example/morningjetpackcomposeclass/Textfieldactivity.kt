package com.example.morningjetpackcomposeclass

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetpackComposeClassTheme

class Textfieldactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                 form()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun form(){
    Column(modifier = Modifier.fillMaxSize().background(color = Color.Blue)) {
        Text(text = "PERSONAL DETAILS", fontSize = 30.sp,color = Color.Red)

        var text by remember { mutableStateOf("") }

         //firstname
        TextField(
            value = text , onValueChange ={text =it},
            label = { Text(text = "firstname")},
            placeholder = { Text(text = "Enter first name")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic),
            leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription = "icon")},
            trailingIcon = {Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),

        )

        //middle
        TextField(
            value = text , onValueChange ={text =it},
            label = { Text(text = "last name")},
            placeholder = { Text(text = "Enter lastname")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic),
            leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription = "icon")},
            trailingIcon = {Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),

            )

        //mail
        var myemail by remember { mutableStateOf("") }

        TextField(
            value = myemail , onValueChange ={myemail =it},
            label = { Text(text = "email")},
            placeholder = { Text(text = "Enter email")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic),
            leadingIcon = {Icon(imageVector = Icons.Default.Email, contentDescription = "icon")},
            trailingIcon = {Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),

            )

        //password
        var pass by remember { mutableStateOf("") }
        TextField(
            value = pass , onValueChange ={pass =it},
            label = { Text(text = "Password")},
            placeholder = { Text(text = "Enter password")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic),
            leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription = "icon")},
            trailingIcon = {Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            visualTransformation = PasswordVisualTransformation()

            )
        //phone
        var phone by remember { mutableStateOf("") }

        TextField(
            value = phone , onValueChange ={phone =it},
            label = { Text(text = "contact")},
            placeholder = { Text(text = "contact")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(color = Color.Gray, fontStyle = FontStyle.Italic),
            leadingIcon = {Icon(imageVector = Icons.Default.Phone, contentDescription = "icon")},
            trailingIcon = {Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),

            )




    }
}

@Preview(showBackground = true)
@Composable
fun formpreview(){
    form()
}