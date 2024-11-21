package com.scorely

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun AccountScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("My Account") })
        }
    ) {
        Column(Modifier.padding(16.dp)) {
            Text("Name: Adam Bassou Merrouchi", style = MaterialTheme.typography.h6)
            Spacer(modifier = Modifier.height(16.dp))
            Text("Settings")
            SwitchPreference(label = "Dark Theme")
        }
    }
}

@Composable
fun SwitchPreference(label: String) {
    val isChecked = remember { mutableStateOf(false) }
    Row(
        Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(label)
        Switch(checked = isChecked.value, onCheckedChange = { isChecked.value = it })
    }
}