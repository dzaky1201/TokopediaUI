package com.dzakyhdr.tokopediaui.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dzakyhdr.tokopediaui.R
import com.dzakyhdr.tokopediaui.data.menu.Menu
import com.dzakyhdr.tokopediaui.databinding.ItemHomeBinding

class GeneralAdapter : RecyclerView.Adapter<GeneralAdapter.ViewHolder>() {

    private val data = ArrayList<Menu>()

    fun setData(newData: List<Menu>?) {
        if (newData == null) return
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        )


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listData = data[position]
        holder.bind(listData)
    }

    override fun getItemCount(): Int = data.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemHomeBinding.bind(itemView)

        fun bind(menu: Menu) {
            binding.title.text = menu.title
            binding.logo.setImageResource(menu.logo)
        }
    }
}