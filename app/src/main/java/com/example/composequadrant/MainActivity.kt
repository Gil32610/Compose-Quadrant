package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantScreen()
                }
            }
        }
    }
}


@Composable
fun QuadrantScreen() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposeCard(
                title = stringResource(R.string.text_composable_title), information = stringResource(
                R.string.text_composable_description),
                backGroundColor = colorResource(R.color.color1),
                modifier = Modifier.weight(1f)
            )

            ComposeCard(
                title = stringResource(R.string.image_composable_title),
                information = stringResource(R.string.image_composable_description) ,
                backGroundColor = colorResource(R.color.color2),
                modifier = Modifier.weight(1f) )
        }
        Row(Modifier.weight(1f)) {
            ComposeCard(
                title = stringResource(R.string.row_composable_title),
                information = stringResource(R.string.row_composable_description),
                backGroundColor = colorResource(R.color.color3),
                modifier = Modifier.weight(1f)
            )
            ComposeCard(
                title = stringResource(R.string.column_composable_title),
                information = stringResource(R.string.column_composable_description),
                backGroundColor = colorResource(R.color.color4),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun ComposeCard(
    title: String,
    information: String,
    modifier: Modifier = Modifier,
    backGroundColor: Color
) {
    Column(modifier = modifier
            .fillMaxSize()
            .background(backGroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = information,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    ComposeQuadrantTheme {
        QuadrantScreen()
    }
}