package com.example.baitaptuan3

import android.R.attr.onClick
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.graphics.Color

@Composable
fun WelcomeScreen(
    onReady: () -> Unit
){
    Column(modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Column(
            modifier = Modifier.weight(1f).fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.images_photoroom),
                contentDescription = "Logo",
                modifier = Modifier.height(200.dp)
            )
            Text(
                text = "Jetpack Compose"
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Jetpack Compose is a modern Ul toolkit for building native Android applications using a declarative programming approach.",
                modifier = Modifier.padding(horizontal = 24.dp).fillMaxWidth(),
                textAlign = TextAlign.Center
            )


        }
        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF39C1FF),
                contentColor = MaterialTheme.colorScheme.onPrimary
            ),
            onClick = {
                onReady()
            },
            modifier = Modifier.width(320.dp)
        ) {
            Text("I'm ready")
        }
        Spacer(modifier = Modifier.height(24.dp))
    }
}