package com.example.composeapp.ui.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(8.dp),
    medium = CutCornerShape(
        topStart = 16.dp,
        topEnd = 0.dp,
        bottomEnd = 16.dp,
        bottomStart = 0.dp
    ),
    large = RoundedCornerShape(50.dp)
)