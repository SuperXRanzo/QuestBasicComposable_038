package com.example.questbasiccomposable_038

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// [cite: 2]
@Composable
fun TataletakColumn(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

// [cite: 2]
@Composable
fun TataletakRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

// [cite: 2]
@Composable
fun TataletakBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Row 2")
    }
}

// [cite: 2]
@Composable
fun TataletakColumnRow(modifier: Modifier = Modifier) {
    Column {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }
    }
}

@Composable
fun TataletakCustomRow(modifier: Modifier = Modifier) {
    Column {
        // Baris 1
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }
        // Baris 2
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris2")
            Text(text = "Komponen2Baris2")
            Text(text = "Komponen3Baris2")
        }
    }
}

//
@Composable
fun TataletakRowColom(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }
        Column {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) {
    // Pastikan kamu punya gambar 'notasibalok.png' (atau .jpg) di folder res/drawable
    val gambar = painterResource(id = R.drawable.notasibalok) //

    Column(modifier = modifier) { // [cite: 12]
        Column { // [cite: 13]
            Row( // [cite: 4]
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Col1 Row1 Komponen1") // [cite: 4]
                Text(text = "Col1 Row1 Komponen2") // [cite: 4]
                Text(text = "Col1 Row1 Komponen3") // [cite: 4]
            }
            Row( // [cite: 4]
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Col1 Row2 Komponen1") // [cite: 4]
                Text(text = "Col1 Row2 Komponen2") // [cite: 4]
                Text(text = "Col1 Row2 Komponen3") // [cite: 4]
            }
        }
        Spacer(modifier = Modifier.height(height = 10.dp)) // [cite: 15, 16]
        Box( // [cite: 17]
            modifier = Modifier
                .fillMaxWidth() // [cite: 19]
                .height(500.dp) // [cite: 20, 25]
                .background(color = Color.Cyan), // [cite: 21, 26]
            contentAlignment = Alignment.Center // [cite: 22, 27]
        ) {
            Image( // [cite: 28]
                painter = gambar,
                contentDescription = null, // [cite: 29]
                contentScale = ContentScale.Fit // [cite: 30, 31]
            )
            Text( // [cite: 32]
                text = "My Mostan", // [cite: 32]
                fontSize = 50.sp, // [cite: 33]
                color = Color.Red, // [cite: 34]
                fontWeight = FontWeight.Bold, // [cite: 35]
                fontFamily = FontFamily.Cursive, // [cite: 36]
                modifier = Modifier.align(Alignment.Center) // [cite: 37, 38]
            )
        } // [cite: 24]
    } // [cite: 14]
}