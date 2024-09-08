package com.uvg.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivityD : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Main4()
        }
    }
}

@Composable
fun Main4() {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Settings",
            fontSize = 20.sp,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 16.dp),
        )


        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.editar_perfil),
                contentDescription = "Edit Profile Icon",
                modifier = Modifier.size(40.dp)
            )
            Text(
                text = "Edit Profile",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 15.dp), // Espacio entre imagen y texto
                fontSize = 20.sp
            )
        }
        Spacer(modifier = Modifier.height(15.dp))

        // Segunda imagen y texto en la misma línea
        Row(
            verticalAlignment = Alignment.CenterVertically, // Alinea el texto e imagen verticalmente
        ) {
            Image(
                painter = painterResource(id = R.drawable.email_adress), // Reemplaza con el ícono adecuado
                contentDescription = "Email Icon",
                modifier = Modifier.size(40.dp)
            )
            Text(
                text = "Email Addresses",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 15.dp), // Espacio entre imagen y texto
                fontSize = 20.sp
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
        ){
            Image(
                painter = painterResource(id = R.drawable.notifications),
                contentDescription = "Notification Icon",
                modifier = Modifier.size(40.dp)
            )
            Text(
                text = "Notifications",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 15.dp),
                fontSize = 20.sp
            )

        }

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.privacy),
                contentDescription = "Privacy Icon",
                modifier = Modifier.size(40.dp)
            )
            Text(
                text = "Privacy",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 15.dp),
                fontSize = 20.sp
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.help_feedback),
                contentDescription = "Help Icon",
                modifier = Modifier.size(40.dp)
            )

            Column {
                Text(
                    text = "Help & Feedback",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 15.dp),
                    fontSize = 20.sp
                )

                Text(
                    text = "Troubleshooting tips and guides",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(start = 15.dp),
                    fontSize = 15.sp
                )
            }


        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.about),
                contentDescription = "About Icon",
                modifier = Modifier.size(40.dp)
            )
            
            Column {
                Text(
                    text = "About",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 15.dp),
                    fontSize = 20.sp
                )

                Text(
                    text = "App information and documents",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 15.dp),
                    fontSize = 15.sp
                )
            }

        }

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Logout",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Red,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.CenterHorizontally) // Centrar el título
                .padding(bottom = 20.dp),
        )



    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainPreview() {
    Main4()
}
