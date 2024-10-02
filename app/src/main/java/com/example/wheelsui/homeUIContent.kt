package com.example.wheelsui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wheelsui.ui.theme.blue
import com.example.wheelsui.ui.theme.lightgreen


@Composable
fun HomeUI(){
    Box(modifier = Modifier.fillMaxWidth()
        .background(Color.White )){

        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.background(blue).fillMaxWidth().height(50.dp))  {
                Buttons(icon = R.drawable.baseline_menu_24, Color.Unspecified)
                Column(verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxHeight())
                { Text(text = "Wheels", fontSize = 30.sp, fontWeight = FontWeight.Bold) }

                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End)
                { Buttons(icon = R.drawable.baseline_search_24) }

            }
            LazyVerticalGrid(columns = GridCells.Fixed(2)){
                items(data.datalist){
                    ShowWheels(data= it)
                }

            }
        }
    }

}


@Composable
fun Buttons(
    @DrawableRes icon:Int,
    tint:Color= Color.Unspecified){
    IconButton(onClick = {}) {
        Icon(painter = painterResource(id= icon),"",
            modifier = Modifier.background(tint))
    }

}

@Composable
fun ShowWheels(data:data.Demo){

    Card(shape = RectangleShape ,
        modifier = Modifier.width(175.dp)
            .height(300.dp)
            .padding(vertical = 5.dp, horizontal = 5.dp))
    {
        Box(modifier = Modifier.fillMaxWidth()){

            Column(modifier = Modifier.fillMaxWidth()
                .padding(vertical = 5.dp, horizontal = 5.dp),
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Image(
                    painter = painterResource(id = data.img),"",
                    modifier = Modifier.size(190.dp)
                        .clip(RectangleShape),
                    contentScale = ContentScale.Crop
                )
                Text(text= data.name, fontSize = 18.sp,
                    fontWeight = FontWeight.W600,
                    color = Color.Black,
                    textAlign = TextAlign.Center)

                Text(text= data.price, fontSize = 16.sp,
                    fontWeight = FontWeight.W400,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
                Button(onClick = {},
                    modifier = Modifier.width(91.dp),
                    shape = RoundedCornerShape(18.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = lightgreen)
                ) {
                    Text("Add",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W600,
                        textAlign = TextAlign.Center
                   )
                }
            }
        }
    }

}