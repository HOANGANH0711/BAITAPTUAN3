package com.example.baitaptuan3

import android.R.attr.text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.IconButton
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
@Composable
fun TextDetailScreen(
    onBack: () -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        Row(
            modifier = Modifier.fillMaxWidth()
                .statusBarsPadding()
                .padding(horizontal = 8.dp)
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
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.padding(horizontal = 24.dp).fillMaxWidth(),
                //textAlign = TextAlign.Center,
                text = buildAnnotatedString {
                    append("The ")
                    withStyle(
                        style = SpanStyle(
                            textDecoration = TextDecoration.LineThrough
                        )
                    ) {
                        append("quick ")
                    }
                    withStyle(
                        style = SpanStyle(
                            color = Color(0xFFFF9800),
                            fontSize = 28.sp
                        )
                    ) {
                        append("Brown ")
                    }
                    append("Fox")
                    withStyle(
                        style = SpanStyle(
                            letterSpacing = 6.sp
                        )
                    ) {
                        append("jumps ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append("over ")
                    }
                    withStyle(
                        style = SpanStyle(
                            textDecoration = TextDecoration.Underline
                        )
                    ) {
                        append("The ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontStyle = FontStyle.Italic
                        )
                    ) {
                        append("Lazy" )
                    }
                    append(" Dog ")
                },
                fontSize = 25.sp
            )
        }
    }
}