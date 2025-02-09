package com.route.islamiappc41gsunwed.home.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islamiappc41gsunwed.databinding.FragmentQuranBinding
import com.route.islamiappc41gsunwed.home.adapters.ChaptersAdapter
import com.route.islamiappc41gsunwed.home.model.AppConstants

class QuranFragment : Fragment() {
    lateinit var binding: FragmentQuranBinding
    lateinit var adapter: ChaptersAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuranBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = ChaptersAdapter(AppConstants.getChaptersList())
        binding.chaptersListRecyclerView.adapter = adapter
    }
}
