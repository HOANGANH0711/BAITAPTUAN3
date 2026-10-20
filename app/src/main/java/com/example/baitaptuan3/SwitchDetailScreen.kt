package com.example.baitaptuan3

import android.R.attr.checked
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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.IconButton
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun SwitchDetailScreen(
    onBack: () -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize().statusBarsPadding().padding(horizontal = 16.dp)
    ){
       Box(
           modifier = Modifier.fillMaxWidth()
       ){
           IconButton(
               onClick = {
                   onBack()
               }
           ) {
               Icon(
                   imageVector = Icons.Default.ArrowBack,
                   contentDescription = "Back"
               )
           }
           Text(
               text = "Switch Detail",
               fontWeight = FontWeight.Bold,
               fontSize = 24.sp,
               modifier = Modifier.align(Alignment.Center),
               color = Color(0xFF39C1FF),
           )
       }
        var checked by remember{
            mutableStateOf(false)
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Switch(
                checked = checked,
                onCheckedChange = {
                    checked = it
                }
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = if(checked){
                    "Dang bat"
                }else{
                    "dang tat"
                }
            )
        }
    }

}