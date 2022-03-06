package com.dzakyhdr.tokopediaui.data.product

import com.dzakyhdr.tokopediaui.R
import com.dzakyhdr.tokopediaui.data.menu.Menu
import com.dzakyhdr.tokopediaui.data.menu.MenuSecondObject

object ProductObject {

    private val price = arrayOf(
        "15.000",
        "100.000",
        "300.000",
        "189.000",
        "400.000",
        "150.000"
    )

    private val realPrice = arrayOf(
        "100.000",
        "140.000",
        "330.000",
        "199.000",
        "450.000",
        "200.000"
    )

    private val discount = arrayOf(
        "20",
        "35",
        "40",
        "40",
        "20",
        "40"
    )

    private val location = arrayOf(
        "Bogor Selatan",
        "Kota Tangerang",
        "Jonggol",
        "Jakarta Timur",
        "Jakarta Barat",
        "Kalimantan Selatan"
    )

    private val poster = intArrayOf(
        R.drawable.list_1,
        R.drawable.list_2,
        R.drawable.list_3,
        R.drawable.list_4,
        R.drawable.list_5,
        R.drawable.list_6
    )

    val list: ArrayList<Product>
        get() {
            val list = arrayListOf<Product>()
            for (position in price.indices){
                val product = Product()
                product.price = price[position]
                product.realPrice = realPrice[position]
                product.discount = discount[position]
                product.location = location[position]
                product.poster = poster[position]
                list.add(product)
            }
            return list
        }
}