package com.example.wheelsui

import androidx.annotation.DrawableRes

object data {
    class Demo(
        @DrawableRes var img : Int,
        var name : String,
        var price : String
    )
     var datalist = listOf(
         Demo(
             R.drawable.img,
             name = "Ferrari",
             price = "$2 Million"
         ),
         Demo(
             R.drawable.porche,
             name = "Porche",
             price = "1.5 Million"
         ),
         Demo(
             R.drawable.img_1,
             name = "BMW",
             price = "$1 Million"
         ),
         Demo(
             R.drawable.img_2,
             name = "Buggati",
             price = "$10 Million"
         ),
         Demo(
             R.drawable.img_3,
             name = "G-Wagon",
             price = "$4 Million"
         ),
         Demo(
             R.drawable.download,
             name = "Rolls-Royce",
             price = "$12 Million"
         )
     )

}