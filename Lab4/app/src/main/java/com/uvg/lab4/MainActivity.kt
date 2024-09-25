package com.example.lab4

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource
import com.uvg.lab4.R


class MainActivityA : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserProfileA()
        }
    }
}

@Composable
fun UserProfileA() {
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(76.dp)
                    .padding(horizontal = 8.dp)
            ) {
                Text(
                    text = "Campus Central",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(horizontal = 60.dp)
                        .offset(y = 10.dp),
                    style = MaterialTheme.typography.headlineLarge.copy(
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Box(modifier = Modifier.fillMaxSize()) {

                Box(
                    modifier = Modifier

                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lab),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxSize()
                            .fillMaxWidth()
                            .offset(y=-300.dp)
                    )
                }

                Text(
                    text = "Destacados",
                    modifier = Modifier
                        .padding(start = 16.dp, top = 230.dp),
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 30.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )

                Box(
                    modifier = Modifier
                        .padding(top = 280.dp, start = 16.dp)
                        .size(width = 160.dp, height = 160.dp)
                        .background(Color(0xFF4CAF50))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.services),
                        contentDescription = null,
                        modifier = Modifier
                            .height(140.dp)
                            .fillMaxWidth()
                    )
                    Text(
                        text = "Service Now",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium

                        ),
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(8.dp)
                            .offset(y=11.dp)
                    )
                }

                Box(
                    modifier = Modifier
                        .padding(top = 280.dp, end = 16.dp)
                        .size(width = 160.dp, height = 160.dp)
                        .background(Color(0xFF9E9E9E))
                        .align(Alignment.TopEnd)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.update),
                        contentDescription = null,
                        modifier = Modifier
                            .height(140.dp)
                            .fillMaxWidth()
                    )
                    Text(
                        text = "Actualidad UVG",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        ),
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(8.dp)
                            .offset(y=11.dp)
                    )
                }

                Text(
                    text = "Servicios y Recursos",
                    modifier = Modifier
                        .padding(start = 16.dp, top = 460.dp),
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                )

                Box(
                    modifier = Modifier
                        .padding(top = 510.dp, start = 16.dp)
                        .size(width = 160.dp, height = 160.dp)
                        .background(Color(0xFF4CAF50))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.dds),
                        contentDescription = null,
                        modifier = Modifier
                            .height(140.dp)
                            .fillMaxWidth()
                    )
                    Text(
                        text = "Directorio de Servicios",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        ),
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(8.dp)
                    )
                }

                Box(
                    modifier = Modifier
                        .padding(top = 510.dp, end = 16.dp)
                        .size(width = 160.dp, height = 160.dp)
                        .background(Color(0xFF9E9E9E)) 
                        .align(Alignment.TopEnd)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.web),
                        contentDescription = null,
                        modifier = Modifier
                            .height(140.dp)
                            .fillMaxWidth()
                    )
                    Text(
                        text = "Portal Web Bibliotecas",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        ),
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(8.dp)
                    )
                }
            }

        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    UserProfileA()
}



