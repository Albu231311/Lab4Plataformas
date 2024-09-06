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
                Image(
                    painter = painterResource(id = R.drawable.rosca),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .align(Alignment.CenterEnd)
                )
                Text(
                    text = "Estas en la A",
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
                Box(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .height(200.dp)
                        .width(1000.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.biblioteca),
                        contentDescription = null,
                        modifier = Modifier
                            .height(500.dp)
                            .width(900.dp)
                            .graphicsLayer(alpha = 0.6f)
                            .align(Alignment.Center)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.img1),
                        contentDescription =null,
                        modifier = Modifier
                            .size(120.dp)
                            .align(Alignment.Center)
                            .offset(y = 65.dp)
                    )
                }

                Text(
                    text = "Estas en La A",
                    modifier = Modifier
                        .padding(start = 0.dp, top = 16.dp, bottom = 8.dp)
                        .align(Alignment.CenterHorizontally),
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp)
                )

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
                    Text(
                        text = "Campus Central",
                        style = MaterialTheme.typography.bodyLarge.copy(fontSize = 14.sp),
                        modifier = Modifier
                            .padding(start = 0.dp, top = 4.dp, bottom = 20.dp)
                            .offset(y = 26.dp)
                            .offset(x = -90.dp)


                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 0.dp, top = 8.dp, bottom = 25.dp)
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
                        .padding(start = 0.dp, top = 8.dp, bottom = 25.dp)
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
                        .padding(start = 0.dp, top = 8.dp, bottom = 25.dp)
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
                        .padding(start = 0.dp, top = 8.dp, bottom = 25.dp)
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
                        .padding(start = 0.dp, top = 8.dp, bottom = 25.dp)
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
                        .padding(start = 0.dp, top = 8.dp, bottom = 25.dp)
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
fun UserProfilePreviewA() {
    UserProfileA()
}
