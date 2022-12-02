package com.example.engineering.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.engineering.databinding.FragmentHomeBinding
import com.example.engineering.ui.home.adapter.MainViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

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
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val imageUrlList = listOf<String>("https://thumb.tildacdn.com/tild3633-3534-4035-b438-373332333637/-/format/webp/ultrasonic-starter-k.jpg",
        "https://thumb.tildacdn.com/tild3137-6266-4936-b033-363536313538/-/format/webp/3e88760b128a5b1f6171.jpg",
        "https://thumb.tildacdn.com/tild6164-3066-4537-b266-316330636230/-/format/webp/ecfbcfbe738a6bdb6663.png")

        val adapter = MainViewPagerAdapter(imageUrlList)
        binding.vp2.adapter = adapter
        binding.vp2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        TabLayoutMediator(binding.tabLayout,binding.vp2){t,pos->
        }.attach()


        homeViewModel.text.observe(viewLifecycleOwner) {

        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}