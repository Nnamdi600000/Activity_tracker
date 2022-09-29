package com.codennamdi.activitytracker

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codennamdi.activitytracker.databinding.FragmentCyclingBinding

class CyclingFragment: Fragment() {

    private lateinit var binding:FragmentCyclingBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCyclingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpClickListeners()
    }

    private fun setUpClickListeners() {
        binding.containerLongestRide.setOnClickListener { launchEditCyclingRecordScreen("Longest Ride") }
        binding.containerHighestClimb.setOnClickListener { launchEditCyclingRecordScreen("Highest Climb") }
        binding.containerAverageRideSpeed.setOnClickListener { launchEditCyclingRecordScreen("Average Ride Speed") }
        binding.containerHighestRideSpeed.setOnClickListener { launchEditCyclingRecordScreen("Highest Ride Speed") }
    }

    private fun launchEditCyclingRecordScreen(meters: String) {
        val intent = Intent(context,EditCyclingRecordActivity::class.java)
        intent.putExtra("Meters", meters)
        startActivity(intent)
    }
}