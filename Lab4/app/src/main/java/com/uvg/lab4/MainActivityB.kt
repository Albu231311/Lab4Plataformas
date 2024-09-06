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
                    .height(76.dp)
                    .padding(horizontal = 8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.rosca),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .align(Alignment.CenterEnd)
                )
                Text(
                    text = "My Profile",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(horizontal = 50.dp),
                    style = MaterialTheme.typography.headlineLarge.copy(fontSize = 30.sp)
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
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                // Fondo
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp) // Ajusta la altura según sea necesario
                        .background(Color.LightGray.copy(alpha = 0.2f)) // Fondo con opacidad
                        .padding(top = 76.dp) // Ajusta la posición del fondo
                        .align(Alignment.CenterHorizontally)
                )

                // Imagen de perfil
                Image(
                    painter = painterResource(id = R.drawable.img1),
                    contentDescription = "Imagen de perfil",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .padding(top = 16.dp, start = 8.dp, end = 8.dp)
                        .align(Alignment.CenterHorizontally)
                )

                // Imagen "biblioteca" detrás del fondo
                Image(
                    painter = painterResource(id = R.drawable.bibloteca),
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(top = 16.dp)
                        .graphicsLayer(alpha = 0.5f) // Ajusta la opacidad
                        .align(Alignment.CenterHorizontally)
                )

                // Información de perfil
                Text(
                    text = "FRANCISCO ROGELIO ANZUETO MARROQUIN",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .padding(8.dp)
                        .align(Alignment.CenterHorizontally)
                )

                // Lista de opciones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 0.dp, top = 16.dp, bottom = 8.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mycampus),
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
                // Repite el patrón para las demás opciones
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 0.dp, top = 8.dp, bottom = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.personas),
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(end = 8.dp)
                    )
                    Text(
                        text = "My Friends",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 0.dp, top = 8.dp, bottom = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.calendario),
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(end = 8.dp)
                    )
                    Text(
                        text = "My Calendar",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 0.dp, top = 8.dp, bottom = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.libro),
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(end = 8.dp)
                    )
                    Text(
                        text = "My Courses",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 0.dp, top = 8.dp, bottom = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.aplus),
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(end = 8.dp)
                    )
                    Text(
                        text = "My Grades",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 0.dp, top = 8.dp, bottom = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.dots),
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(end = 8.dp)
                    )
                    Text(
                        text = "My Groups",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 0.dp, top = 8.dp, bottom = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.calendarioazul),
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(end = 8.dp)
                    )
                    Text(
                        text = "My Upcoming Events",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun UserProfilePreview() {
    UserProfile()
}
