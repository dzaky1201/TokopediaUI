package com.dzakyhdr.tokopediaui.data.menu

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Menu(
    val id: Int = 0,
    var title: String = "",
    var logo: Int = 0,
): Parcelable
