package sanjar.uz.navigationwithvoyager.voyager

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator

class Screen1 : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "First Screen")
            Spacer(modifier = Modifier.height(50.dp))
            Button(onClick = { navigator?.push(Screen2()) }) {
                Text(text = "Go to Screen 2")
            }
        }
    }
}