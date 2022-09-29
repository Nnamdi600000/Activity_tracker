package com.codennamdi.activitytracker

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codennamdi.activitytracker.databinding.FragmentRunningBinding

class RunningFragment : Fragment() {

    private lateinit var binding: FragmentRunningBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRunningBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpClickListeners()
    }

    private fun setUpClickListeners() {
        binding.container5km.setOnClickListener { launchEditRunningRecordScreen("5km") }
        binding.container10km.setOnClickListener { launchEditRunningRecordScreen("10km") }
        binding.containerHalfMarathonValue.setOnClickListener { launchEditRunningRecordScreen("Half-Marathon") }
        binding.containerOneMarathon.setOnClickListener { launchEditRunningRecordScreen("Marathon") }
    }

    private fun launchEditRunningRecordScreen(distance: String) {
        val intent = Intent(context, EditRunningRecordActivity::class.java)
        intent.putExtra("Distance", distance)
        startActivity(intent)
    }
}