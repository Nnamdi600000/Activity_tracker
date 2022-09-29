package com.codennamdi.activitytracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codennamdi.activitytracker.databinding.ActivityEditCyclingRecordBinding

class EditCyclingRecordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditCyclingRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditCyclingRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Making the toolbar dynamic
        val meters = intent.getStringExtra("Meters")
        title = "$meters Record"
    }
}