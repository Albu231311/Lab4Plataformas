package com.example.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uvg.lab4.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserProfile()
        }
    }
}

@Composable
fun UserProfile() {
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(5.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.rosca),
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .align(Alignment.CenterEnd)
                )
                Text(
                    text = "My Profile",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(end = 60.dp), // Ajusta el padding para alinear el texto correctamente
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 10.sp)
                )
            }
        }
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img1),
                    contentDescription = "Imagen de perfil",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(8.dp)
                )
                Text(
                    text = "FRANCISCO ROGELIO ANZUETO MARROQUIN",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .padding(8.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 50.dp, top = 50.dp, bottom = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rosca),
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(end = 8.dp) 
                    )
                    Text(
                        text = "My Campus",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                Text(
                    text = "Campus Central",
                    modifier = Modifier
                        .padding(start = 50.dp, top = 0.dp, bottom = 10.dp)
                        .align(Alignment.Start),
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 10.sp)
                )
                Text(
                    text = "My Friends",
                    modifier = Modifier
                        .padding(start = 50.dp, top = 8.dp, bottom = 15.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "My Calendar",
                    modifier = Modifier
                        .padding(start = 50.dp, top = 8.dp, bottom = 15.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "My Courses",
                    modifier = Modifier
                        .padding(start = 50.dp, top = 8.dp, bottom = 15.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "My Grades",
                    modifier = Modifier
                        .padding(start = 50.dp, top = 8.dp, bottom = 15.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "My Groups",
                    modifier = Modifier
                        .padding(start = 50.dp, top = 8.dp, bottom = 15.dp)
                        .align(Alignment.Start)
                )
                Text(
                    text = "My Upcoming Events",
                    modifier = Modifier
                        .padding(start = 50.dp, top = 8.dp, bottom = 15.dp)
                        .align(Alignment.Start)
                )
            }
        }
    }
}

@Preview
@Composable
fun UserProfilePreview() {
    UserProfile()
}