package com.maneeshwar.dl

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maneeshwar.dl.ui.theme.shadeblue













@Composable
fun PreviewListdog() {
    val items = getItemList()
    LazyRow() {
        items(items) { item ->
            ListView(name = item.name, breed = item.breed, age = item.age, img = item.img)
        }
    }
}
@Composable
fun ListView(name: String, breed: String, age: String, img: Int) {
    Card(
        modifier = Modifier
            .padding(10.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(246,153,92)
        )
    ) {
        Card(
            modifier = Modifier.padding(10.dp),
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(containerColor = Color(58,166,185))
        ) {
            InsideCard(name = name, breed = breed, age = age, img = img)
        }
    }
}

@Composable
fun InsideCard(name: String, breed: String, age: String, img: Int) {
    Column(modifier = Modifier.padding(10.dp)                                                                                                               , verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Name:$name", fontFamily = FontFamily.Serif, fontWeight = FontWeight.ExtraBold)
        Text(text = "Breed:$breed", fontSize = (12.sp), fontWeight = FontWeight.ExtraBold, fontFamily = FontFamily.Serif)
        Text(text = "Age:$age", fontFamily =FontFamily.Serif, fontWeight = FontWeight.SemiBold)
        Spacer(modifier =Modifier.height(10.dp))
        Image(
            painter = painterResource(id = img),
            contentDescription = "img",
            modifier = Modifier
                .size(100.dp)



        )
    }
}

data class Item(val name: String, val breed: String, val age: String, val img: Int)

fun getItemList(): List<Item> {
    return listOf(
        Item("Bhairava", "Golden Retriever", "1 Month", R.drawable.goldenretirver),
        Item("Ramu", "Border Collie", "1.5 Months", R.drawable.pngegg),
        Item("Tyson", "Labrador", "3 Months", R.drawable.lab),
        Item("Sheru","Retriver","0.5 Months",R.drawable.whiteretiver)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewListPreview() {
    PreviewListdog()
}

