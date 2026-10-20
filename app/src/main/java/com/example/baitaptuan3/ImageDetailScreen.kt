package com.example.baitaptuan3

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.IconButton
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage

@Composable
fun ImageDetailScreen(
    onBack: () -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize()
            .statusBarsPadding()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier.fillMaxWidth(),
        ){
            IconButton(
                onClick = {
                    onBack()
                }
            ){
                Icon (
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back"
                )
            }
            Text(
                text = "Image Detail",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.Center),
                color = Color(0xFF39C1FF),
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(R.drawable.anh),
            contentDescription = "Image",
            modifier = Modifier.fillMaxWidth().height(220.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "In App",
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(20.dp))

        AsyncImage(
            model = "https://cdn-media.sforum.vn/storage/app/media/anh-dep-83.jpg",
            contentDescription = "Image",
            modifier = Modifier.fillMaxWidth().height(220.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "https://cdn-media.sforum.vn/storage/app/media/anh-dep-83.jpg",
            fontWeight = FontWeight.Bold,
        )


    }
}