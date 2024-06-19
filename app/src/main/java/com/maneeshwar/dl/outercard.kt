package com.maneeshwar.dl

import android.print.PrintAttributes.Margins
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable

fun outercarddogs(){
    Card(elevation = CardDefaults.cardElevation(defaultElevation = 15.dp),
        colors=CardDefaults.cardColors(containerColor = Color(255,194,111   ) ),
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()) {
        Text(text = "Dogs", fontFamily = FontFamily.Serif, fontWeight = FontWeight.Bold, fontSize = (20.sp))

        Spacer(modifier = Modifier.height(20.dp))
        Spacer(modifier = Modifier.width(20.dp))

        Spacer(modifier = Modifier.height(10.dp))
        Card(
            elevation = CardDefaults.cardElevation(defaultElevation = 40.dp),
            colors=CardDefaults.cardColors(containerColor = Color(219,181,181) ),
            modifier = Modifier
                .fillMaxWidth()) {
            Text(text = "Adopting a dog provides unconditional love, improved physical and mental health, and increased social interactions. Dogs reduce loneliness, stress, and anxiety while encouraging exercise and offering protection. They teach responsibility and empathy, especially to children, and bring joy and purpose to your life. By adopting, you also save a life and support animal welfare."
                , fontFamily = FontFamily.Serif, fontWeight = FontWeight.SemiBold, modifier = Modifier.padding(15.dp,10.dp)
            )

            PreviewListdog()

        }

    }


}
@Preview
@Composable
fun outercardcats(){
    Card(elevation = CardDefaults.cardElevation(defaultElevation = 15.dp),
        colors=CardDefaults.cardColors(containerColor = Color(255,194,111) ),
        modifier = Modifier.padding(10.dp)
            .fillMaxWidth()) {

        Spacer(modifier = Modifier.height(20.dp))
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = "Cats", fontFamily = FontFamily.Serif, fontWeight = FontWeight.Bold, fontSize = (20.sp))

        Spacer(modifier = Modifier.height(10.dp))
        Card(
            elevation = CardDefaults.cardElevation(defaultElevation = 40.dp),
            colors=CardDefaults.cardColors(containerColor = Color(219,181,181) ),
            modifier = Modifier
                .fillMaxWidth()) {
            Text(text="Adopting a cat offers many benefits, including companionship, reduced stress and anxiety, and improved mental well-being. Cats provide affection, comfort, and a sense of purpose, while their playful nature brings joy and laughter. They encourage relaxation and can help lower blood pressure. Cats are low-maintenance pets, making them ideal for various lifestyles. Adopting a cat from a shelter saves a life and supports animal welfare, giving a deserving animal a loving home."
                , fontFamily = FontFamily.Serif, fontWeight = FontWeight.SemiBold, modifier = Modifier.padding(15.dp,10.dp)
            )

            PreviewListcats()

        }

    }


}

