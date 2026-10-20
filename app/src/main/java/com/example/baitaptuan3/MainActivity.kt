package com.example.baitaptuan3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.baitaptuan3.ui.theme.BaiTapTuan3Theme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = "welcome"
            ){
                composable("welcome"){
                    WelcomeScreen(
                        onReady = {
                            navController.navigate("components")
                        }
                    )
                }
                composable("components"){
                    ComponentsScreen(
                        onTextClick = {
                            navController.navigate("textdetail")
                        },
                        onImageClick = {
                            navController.navigate("imageDetail")
                        },
                        onIconClick = {
                            navController.navigate("iconDetail")
                        },
                        onCardClick = {
                            navController.navigate("cardDetail")
                        },
                        onTextFieldClick = {
                            navController.navigate("textFieldDetail")
                        },
                        onPassWordFieldClick = {
                            navController.navigate("passwordFieldDetail")
                        },
                        onCheckboxClick = {
                            navController.navigate("checkboxDetail")
                        },
                        onSwitchClick = {
                            navController.navigate("switchDetail")
                        },
                        onRadioButtonClick = {
                            navController.navigate("radioButtonDetail")
                        },
                        onColumnClick = {
                            navController.navigate("columnDetail")
                        },
                        onRowClick = {
                            navController.navigate("rowDetail")
                        },
                        onBoxClick = {
                            navController.navigate("boxDetail")
                        },
                        onSpacerClick = {
                            navController.navigate("spacerDetail")
                        },
                        onButtonClick = {
                            navController.navigate("buttonDetail")
                        },
                        onIconButtonClick = {
                            navController.navigate("iconButtonDetail")
                        }
                    )
                }
                composable("textdetail"){
                    TextDetailScreen(
                        onBack = {
                            navController.popBackStack()
                        }
                    )
                }
                composable("imageDetail"){
                    ImageDetailScreen(
                        onBack = {
                            navController.popBackStack()
                        }
                    )
                }
                composable("iconDetail"){
                    IconDetailScreen(
                        onBack = {
                            navController.popBackStack()
                        }
                    )
                }
                composable("cardDetail"){
                    CardDetailScreen(
                        onBack = {
                              navController.popBackStack()
                        }
                    )
                }
                composable("textFieldDetail"){
                    TextFieldDetailScreen(
                        onBack = {
                            navController.popBackStack()
                        }
                    )
                }
                composable ("passwordFieldDetail" ){
                    PassWordFieldDetailScreen (
                        onBack = {
                            navController.popBackStack()
                        }
                    )
                }
                composable("checkboxDetail"){
                    CheckboxDetailScreen(
                        onBack = {
                            navController.popBackStack()
                        }
                    )
                }
                composable("switchDetail"){
                    SwitchDetailScreen(
                        onBack = {
                            navController.popBackStack()
                        }
                    )
                }
                composable("radioButtonDetail"){
                    RadioButtonDetailScreen(
                        onBack = {
                            navController.popBackStack()
                        }
                    )
                }
                composable("columnDetail"){
                    ColumnDetailScreen(
                        onBack = {
                            navController.popBackStack()
                        }
                    )
                }
                composable("rowDetail"){
                    RowDetailScreen(
                        onBack = {
                            navController.popBackStack()
                        }
                    )
                }
                composable("boxDetail"){
                    BoxDetailScreen(
                        onBack = {
                            navController.popBackStack()
                        }
                    )
                }
                composable("spacerDetail"){
                    SpacerDetailScreen(
                        onBack = {
                            navController.popBackStack()
                        }
                    )
                }
                composable("buttonDetail"){
                    ButtonDetailScreen(
                        onBack = {
                            navController.popBackStack()
                        }
                    )
                }
                composable("iconButtonDetail"){
                    IconButtonDetailScreen(
                        onBack = {
                            navController.popBackStack()
                        }
                    )
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
}