package com.example.baitaptuan3

import android.R.attr.onClick
import android.R.attr.text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun ComponentsScreen(
    onTextClick: () -> Unit,
    onImageClick: () -> Unit,
    onIconClick: () -> Unit,
    onCardClick: () -> Unit,
    onTextFieldClick: () -> Unit,
    onPassWordFieldClick: () -> Unit,
    onCheckboxClick: () -> Unit,
    onSwitchClick: () -> Unit,
    onRadioButtonClick: () -> Unit,
    onColumnClick: () -> Unit,
    onRowClick: () -> Unit,
    onBoxClick: () -> Unit,
    onSpacerClick: () -> Unit,
    onButtonClick: () -> Unit,
    onIconButtonClick: () -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp).verticalScroll(rememberScrollState())
    ){
        Text(
            text = "UI Components List",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth().padding(top = 15.dp),
            textAlign = TextAlign.Center,
            color = Color(0xFF39C1FF)
        )
        Spacer(modifier = Modifier.height(20.dp))
        //Display
        Text(
            text = "Display",
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        ComponentCard(
            title = "Text",
            description = "Displaytext",
            onClick = {
                onTextClick()
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        ComponentCard(
            title = "Image",
            description = "Displays an image",
            onClick = {
                onImageClick()
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        ComponentCard("Icon", "Displays an icon",
            onClick = {
                onIconClick()
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        ComponentCard("Card", "Displays content inside a card",
            onClick = {
                onCardClick()
            }
        )
        Spacer(modifier = Modifier.height(20.dp))

        //Input
        Text(
            text = "Input",
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        ComponentCard(
            title = "TextField",
            description = "Input field for text",
            onClick = {
                onTextFieldClick()
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        ComponentCard(
            title = "PasswordField",
            description = "Input field for password",
            onClick = {
                onPassWordFieldClick()
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        ComponentCard("Checkbox", "Allows multiple selections",
            onClick = {
                onCheckboxClick()
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        ComponentCard("Switch", "Turns an option on or off",
            onClick = {
                onSwitchClick()
            }
        )

        Spacer(modifier = Modifier.height(8.dp))
        ComponentCard("RadioButton", "Selects one option",
            onClick = {
                onRadioButtonClick()
            }
        )
        Spacer(modifier = Modifier.height(20.dp))

        //Layout
        Text(
            text = "Layout",
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        ComponentCard("Column", "Arranges elements vertically",
            onClick = {
                onColumnClick()
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        ComponentCard("Row", "Arranges elements horizontally",
            onClick = {
                onRowClick()
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        ComponentCard("Box", "Stacks elements on top of each other",
            onClick = {
                onBoxClick()
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        ComponentCard("Spacer", "Creates empty space",
            onClick = {
                onSpacerClick()
            })
        Spacer(modifier = Modifier.height(20.dp))

        //Button
        Text(
            text = "Button",
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        ComponentCard("Button", "Clickable action button",
            onClick = {
                onButtonClick()
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        ComponentCard("IconButton", "Clickable icon button",
            onClick = {
                onIconButtonClick()
            }
        )

    }
}
 @Composable
 fun ComponentCard(
     title: String,
     description: String,
     onClick: () -> Unit = {}
 ) {
     Card(
         modifier = Modifier
             .fillMaxWidth()
             .clickable{
                 onClick()
             },
         colors = CardDefaults.cardColors(
             containerColor = Color(0xFFBBDEFB)
         )

     ){
         Column(
             modifier = Modifier.padding(16.dp)
         ){
             Text(
                 text = title,
                 fontWeight = FontWeight.Bold
             )
             Text(
                 text = description
             )
         }
     }
 }