package com.example.baitaptuan3

import android.R.id.checkbox
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.material3.Checkbox
@Composable
fun CheckboxDetailScreen(
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
            text = "Checkbox Detail",
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
          verticalAlignment = Alignment.CenterVertically
      ){
          Checkbox(
              checked = checked,
              onCheckedChange = {
                  checked = it
              }
          )
          Text(
              text = if(checked){
                  "Da chon"
              }else{
                  "chua chon"
              }
          )
      }
  }
}