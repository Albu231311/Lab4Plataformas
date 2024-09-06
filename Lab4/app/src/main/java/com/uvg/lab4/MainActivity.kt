package com.example.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                        .offset(y = 25.dp),
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
                // Imagen de la biblioteca
                Box(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .height(200.dp)
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.biblioteca),
                        contentDescription = null,
                        modifier = Modifier
                            .height(200.dp)
                            .fillMaxWidth()
                            .graphicsLayer(alpha = 0.6f)
                    )
                }

                // Texto "Destacados"
                Text(
                    text = "Destacados",
                    modifier = Modifier
                        .padding(start = 16.dp, top = 230.dp),
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 30.sp)
                )

                // Primera caja: Service Now
                Box(
                    modifier = Modifier
                        .padding(top = 280.dp, start = 16.dp)
                        .size(width = 160.dp, height = 160.dp)
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rosca),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                    )
                    Text(
                        text = "Service Now",
                        style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(8.dp)
                    )
                }

                // Segunda caja: Actualidad UVG
                Box(
                    modifier = Modifier
                        .padding(top = 280.dp, end = 16.dp)
                        .size(width = 160.dp, height = 160.dp)
                        .background(Color.LightGray)
                        .align(Alignment.TopEnd)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.libro),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                    )
                    Text(
                        text = "Actualidad UVG",
                        style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(8.dp)
                    )
                }

                // Texto "Servicios y Recursos"
                Text(
                    text = "Servicios y Recursos",
                    modifier = Modifier
                        .padding(start = 16.dp, top = 460.dp),
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 30.sp)
                )

                // Tercera caja: Directorio de Servicios
                Box(
                    modifier = Modifier
                        .padding(top = 510.dp, start = 16.dp)
                        .size(width = 160.dp, height = 160.dp)
                        .background(Color.LightGray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img1),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                    )
                    Text(
                        text = "Directorio de Servicios",
                        style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(8.dp)
                    )
                }

                // Cuarta caja: Portal Web Bibliotecas
                Box(
                    modifier = Modifier
                        .padding(top = 510.dp, end = 16.dp)
                        .size(width = 160.dp, height = 160.dp)
                        .background(Color.LightGray)
                        .align(Alignment.TopEnd)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mycampus),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                    )
                    Text(
                        text = "Portal Web Bibliotecas",
                        style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(8.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun UserProfilePreviewA() {
    UserProfileA()
}
