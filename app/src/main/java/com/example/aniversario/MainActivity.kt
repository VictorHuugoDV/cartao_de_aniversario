package com.example.aniversario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aniversario.ui.theme.AniversarioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AniversarioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ImagemAniversario(
                        stringResource(id = R.string.feliz_anivers_rio_victor),
                        stringResource(id = R.string.com_amor_maria)
                    )

                }
            }
        }
    }
}

@Composable
fun ImagemAniversario(mensagem: String, Remetente: String) {

    Box() {
        Image(
            painter = painterResource(id = R.drawable.aniversario),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        TextoAniversario(
            mensagem = mensagem,
            Remetente = Remetente,
            modificador = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }

}

@Composable
fun TextoAniversario(mensagem: String, Remetente: String, modificador: Modifier) {
    Column(verticalArrangement = Arrangement.Center, modifier = Modifier) {
        Text(
            text = mensagem, fontSize = 70.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 90.dp)
        )

        Text(
            text = Remetente, fontSize = 36.sp,
            modifier = Modifier
                .padding(top = 260.dp)
                .padding(end = 16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ImagemAniversarioVisualizasao() {
    AniversarioTheme {
        ImagemAniversario(
            stringResource(R.string.feliz_anivers_rio_victor),
            stringResource(R.string.com_amor_maria),

            )
    }
}
