package com.scorely


import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Scorely") })
        }
    ) {
        Column(Modifier.padding(16.dp)) {
            Text("Live Now", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(5) { // Example for displaying matches
                    MatchCard(
                        team1 = "Team A",
                        team2 = "Team B",
                        score = "1 - 0"
                    )
                }
            }
        }
    }
}

@Composable
fun MatchCard(team1: String, team2: String, score: String) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("$team1 vs $team2", fontSize = 16.sp)
        Text(score, fontSize = 16.sp, fontWeight = FontWeight.Bold)
    }
}