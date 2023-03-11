package com.alainmk.composecomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alainmk.composecomponents.ui.theme.ComposeComponentsTheme
import com.alainmk.library.TAG
import com.alainmk.library.components.CustomButton
import com.alainmk.library.components.CustomButtonWithIcon
import com.alainmk.library.components.CustomOutlinedButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        print(TAG)
        setContent {
            ComposeComponentsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android $TAG")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column {
        CustomButton(text = "Click me!", shape = RoundedCornerShape(10.dp), onClick = {  })
        CustomOutlinedButton(text = "Click me!", shape = RoundedCornerShape(10.dp), onClick = {  })
        CustomButtonWithIcon(
            text = "Click me!",
            shape = RoundedCornerShape(10.dp),
            icon = Icons.Default.Add,
            onClick = {  }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeComponentsTheme {
        Greeting("Android")
    }
}