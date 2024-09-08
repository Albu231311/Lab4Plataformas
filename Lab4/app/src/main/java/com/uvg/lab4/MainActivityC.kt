package com.uvg.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivityC : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Mainscreen()
        }
    }
}

@Composable
fun Mainscreen() {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Título de emergencias
        Text(
            text = "Emergency Contacts",
            fontSize = 20.sp,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 16.dp)
        )

        // Primer bloque: Emergencias
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.emergency),
                contentDescription = "Emergency Icon",
                modifier = Modifier.size(40.dp)
            )

            Column {
                Text(
                    text = "Emergencias",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 15.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = "Si se presenta un incidente o un percance" +
                            " por favor marcar el número de emergencia" +
                            " y rapidamente te apoyamos",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 15.dp),
                    fontSize = 15.sp
                )
            }

        }

        Row (
            modifier = Modifier
                .background(Color(0xFF006C40), shape = RoundedCornerShape(8.dp))
                .padding(horizontal = 16.dp, vertical = 15.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ){
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "Phone Icon",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )

            Text(
                text = "Call 5978 - 1736",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 15.dp)
            )
        }

        // Segundo bloque: Clínica UVG
        Spacer(modifier = Modifier.height(30.dp))

        // Aquí está el cambio: título de Clínica UVG y la imagen en una fila
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.clinica),
                contentDescription = "Clinic Icon",
                modifier = Modifier.size(50.dp)
            )

            Text(
                text = "Clínica UVG",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 15.dp),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        // Detalles de la clínica en columnas
        Column {
            Text(
                text = "La Clínica UVG, presta los siguientes servicios:",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 60.dp),
                fontSize = 15.sp
            )

            Text(
                text = "- Atención a Emergencias",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 60.dp),
                fontSize = 15.sp
            )

            Text(
                text = "- Atención Primaria a Enfermedades Comunes",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 60.dp),
                fontSize = 15.sp
            )

            Text(
                text = "- Plan Educacional sobre Enfermedades",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 60.dp),
                fontSize = 15.sp
            )

            Text(
                text = "Horario de Atención: 7:00 a.m. a 8:30 p.m.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 60.dp),
                fontSize = 15.sp
            )

            Text(
                text = "Campus Central Edificio F 119-120.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 60.dp),
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(15.dp))

        }

        Row (
            modifier = Modifier
                .background(Color(0xFF006C40), shape = RoundedCornerShape(8.dp))
                .padding(horizontal = 16.dp, vertical = 15.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ){
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "Phone Icon",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )

            Text(
                text = "Call 2507-1500 ex 21312",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 15.dp)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun MainPreview1() {
    Mainscreen()
}

