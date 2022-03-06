package com.dzakyhdr.tokopediaui.data.menu

import com.dzakyhdr.tokopediaui.R

object MenuObject {
    private val title = arrayOf(
        "Official Store",
        "Lihat Semua",
        "Kebutuhan Harian",
        "Elektronik",
        "Top-Up & Tagihan",
        "Office & Stationery",
        "Keuangan",
        "Travel & Entertaiment",
        "Perlengkapan Pesta",
    )

    private val logo = intArrayOf(
        R.drawable.official,
        R.drawable.lihat_semua,
        R.drawable.kebutuhan_harian,
        R.drawable.elektronik,
        R.drawable.topup,
        R.drawable.office,
        R.drawable.keuangan,
        R.drawable.travel,
        R.drawable.perlengkapan_pesta,
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