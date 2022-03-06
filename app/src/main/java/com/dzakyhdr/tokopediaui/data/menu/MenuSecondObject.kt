package com.dzakyhdr.tokopediaui.data.menu

import com.dzakyhdr.tokopediaui.R

object MenuSecondObject {
    private val title = arrayOf(
        "Bazzar Hari Ini",
        "Live Shopping",
        "Tokopedia Seru",
        "Bangga Lokal",
        "Bayar Di Tempat"
    )

    private val logo = intArrayOf(
        R.drawable.bazzar,
        R.drawable.live,
        R.drawable.tokped_seru,
        R.drawable.bangga_local,
        R.drawable.cod
    )

    val list: ArrayList<Menu>
        get() {
            val list = arrayListOf<Menu>()
            for (position in title.indices){
                val menu = Menu()
                menu.title = title[position]
                menu.logo = logo[position]
                list.add(menu)
            }
            return list
        }
}