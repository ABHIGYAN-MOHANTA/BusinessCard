package com.example.businesscardapp

import androidx.compose.material.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(){
    Box{
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xff018786)), horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                val image =
                    painterResource(id = com.example.businesscardapp.R.drawable.android_logo);
                Image(painter = image, contentDescription = null, modifier = Modifier.padding(start=124.dp, end = 124.dp))
                Text("Abhigyan Mohanta", color = Color.White, fontSize = 32.sp)
                Text("Android Developer Extraordinaire", color = Color(0xFF3ddc84), fontWeight = FontWeight.Bold)
            }
            Column(modifier = Modifier.padding(top = 300.dp)) {
                Row(modifier = Modifier.padding(bottom = 20.dp)) {
                    Icon(Icons.Rounded.Call, contentDescription = "Localized description", tint = Color(0xFF3ddc84), modifier = Modifier.padding(end = 10.dp))
                    Text("+91 9876543210", color = Color.White)
                }
                Row(modifier = Modifier.padding(bottom = 20.dp)) {
                    Icon(Icons.Rounded.Email, contentDescription = "Localized description", tint = Color(0xFF3ddc84), modifier = Modifier.padding(end = 10.dp))
                    Text("johndoe123@gmail.com", color = Color.White)
                }
                Row(modifier = Modifier.padding(bottom = 20.dp)) {
                    Icon(Icons.Rounded.Share, contentDescription = "Localized description", tint = Color(0xFF3ddc84), modifier = Modifier.padding(end = 10.dp))
                    Text("@AndroidDev", color = Color.White)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardAppTheme {
        BusinessCard()
    }
}