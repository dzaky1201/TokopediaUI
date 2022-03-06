package com.dzakyhdr.tokopediaui.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dzakyhdr.tokopediaui.R
import com.dzakyhdr.tokopediaui.data.menu.Menu
import com.dzakyhdr.tokopediaui.data.product.Product
import com.dzakyhdr.tokopediaui.databinding.ItemHomeBinding
import com.dzakyhdr.tokopediaui.databinding.ItemProductBinding

class ProductAdapter(context: Context?) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    private val data = ArrayList<Product>()

    private val mContext = context

    fun setData(newData: List<Product>?) {
        if (newData == null) return
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        )


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listData = data[position]
        holder.bind(listData)
    }

    override fun getItemCount(): Int = data.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemProductBinding.bind(itemView)

        fun bind(product: Product) {
            binding.price.text = mContext?.getString(R.string.price, product.price)
            binding.txtPriceDiscount.text = mContext?.getString(R.string.price, product.realPrice)
            binding.txtLocation.text = product.location
            binding.imgProduct.setImageResource(product.poster)
        }
    }
}