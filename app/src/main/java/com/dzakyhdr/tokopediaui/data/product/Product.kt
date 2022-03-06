package com.dzakyhdr.tokopediaui.data.product

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
    var id: Int = 0,
    var price: String = "",
    var realPrice: String = "",
    var discount: String = "",
    var location: String = "",
    var poster: Int = 0
): Parcelable
