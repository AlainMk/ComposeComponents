package com.alainmk.library.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: RoundedCornerShape? = null,
) {
    val buttonColor = MaterialTheme.colors.primary
    val textColor = MaterialTheme.colors.onPrimary

    Button(
        onClick = onClick,
        modifier = modifier
            .padding(16.dp)
            .height(48.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = buttonColor,
            contentColor = textColor
        ),
        shape = shape ?: RoundedCornerShape(24.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        elevation = ButtonDefaults.elevation(defaultElevation = 8.dp, pressedElevation = 16.dp),
    ) {
        Text(text = text, style = MaterialTheme.typography.button)
    }
}

@Composable
fun CustomOutlinedButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: RoundedCornerShape? = null,
) {
    val borderColor = MaterialTheme.colors.primary

    Button(
        onClick = onClick,
        modifier = modifier
            .padding(horizontal = 24.dp, vertical = 16.dp)
            .fillMaxWidth()
            .height(48.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
            contentColor = borderColor
        ),
        shape = shape ?: MaterialTheme.shapes.medium,
        contentPadding = PaddingValues(horizontal = 16.dp),
        border = BorderStroke(width = 2.dp, color = borderColor),
        elevation = ButtonDefaults.elevation(defaultElevation = 0.dp, pressedElevation = 2.dp),
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.button,
            color = borderColor,
            modifier = Modifier.padding(4.dp)
        )
    }
}

