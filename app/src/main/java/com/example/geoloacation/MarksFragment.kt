package com.example.geoloacation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.geoloacation.databinding.MarksListLayoutBinding
import com.yandex.mapkit.map.PlacemarkMapObject

    class MarksFragment(private val collection: MutableList<PlacemarkMapObject>) : Fragment() {

        private var _binding: MarksListLayoutBinding? = null
        private val binding
            get() = _binding!!

        lateinit var adapter: MarksRecyclerAdapter

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?,
        ): View {
            _binding = MarksListLayoutBinding.inflate(inflater, container, false)
            adapter = MarksRecyclerAdapter(collection)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            binding.recycler.adapter = adapter
        }
}