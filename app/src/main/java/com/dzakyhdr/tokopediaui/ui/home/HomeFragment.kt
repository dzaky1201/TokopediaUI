package com.dzakyhdr.tokopediaui.ui.home

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.dzakyhdr.tokopediaui.R
import com.dzakyhdr.tokopediaui.data.menu.MenuObject
import com.dzakyhdr.tokopediaui.data.menu.MenuSecondObject
import com.dzakyhdr.tokopediaui.data.product.ProductObject
import com.dzakyhdr.tokopediaui.databinding.FragmentHomeBinding
import com.dzakyhdr.tokopediaui.ui.GeneralAdapter
import com.dzakyhdr.tokopediaui.ui.ProductAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.toolbar.title = getString(R.string.app_name)
        binding.toolbar.setTitleTextColor(Color.WHITE)

        binding.toolbar.inflateMenu(R.menu.action_menu_home)
        binding.toolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.shopping -> {
                    Toast.makeText(context, "Shopping Di click", Toast.LENGTH_SHORT)
                        .show()
                    true
                }
                else -> false
            }
        }

        val adapter = GeneralAdapter()
        adapter.setData(MenuObject.list)
        binding.rvMenu.adapter = adapter
        binding.rvMenu.setHasFixedSize(true)

        val adapterSecond = GeneralAdapter()
        adapterSecond.setData(MenuSecondObject.list)
        binding.rvMenuSecond.adapter = adapterSecond
        binding.rvMenuSecond.setHasFixedSize(true)

        val productAdapter = ProductAdapter(context)
        productAdapter.setData(ProductObject.list)
        binding.rvProduct.adapter = productAdapter
        binding.rvProduct.setHasFixedSize(true)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}