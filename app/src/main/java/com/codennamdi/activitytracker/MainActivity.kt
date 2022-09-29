package com.codennamdi.activitytracker

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.codennamdi.activitytracker.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNav.setOnItemSelectedListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.reset_running -> {
            Toast.makeText(this, "Reset Running", Toast.LENGTH_SHORT).show()
            true
        }
        R.id.reset_cycling -> {
            Toast.makeText(this, "Reset Cycling", Toast.LENGTH_SHORT).show()
            true
        }
        R.id.reset_all -> {
            Toast.makeText(this, "Reset All", Toast.LENGTH_SHORT).show()
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }

    private fun onBtnRunningClicked(): Boolean {
        supportFragmentManager.commit {
            replace(R.id.frame_content_id, RunningFragment())
        }
        return true
    }

    private fun onBtnCyclingClicked(): Boolean {
        supportFragmentManager.commit {
            replace(R.id.frame_content_id, CyclingFragment())
        }
        return true
    }

    override fun onNavigationItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.nav_running -> onBtnRunningClicked()
        R.id.nav_cycling -> onBtnCyclingClicked()
        else -> false
    }
}