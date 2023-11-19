package com.example.assignment10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assignment10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var settingsList = mutableListOf<SettingsClass>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fillData()
        useRecycler()
    }

    private fun useRecycler(){
        binding.settingsRecycler.layoutManager = LinearLayoutManager(this)
        binding.settingsRecycler.adapter = SettingsRecyclerAdapter(settingsList = settingsList)
    }

    private fun fillData() {
        settingsList.also {
            it.add(
                SettingsClass(
                    startIcon = R.drawable.profile,
                    name = "Edit Profile",
                    additionalInfo = "",
                    endIcon = R.drawable.next_arrow,
                    color = R.color.gainsboro
                )
            )
            it.add(
                SettingsClass(
                    startIcon = R.drawable.address,
                    name = "Address",
                    additionalInfo = "",
                    endIcon = R.drawable.next_arrow,
                    color = R.color.gainsboro
                )
            )
            it.add(
                SettingsClass(
                    startIcon = R.drawable.notification_bell,
                    name = "Notification",
                    additionalInfo = "",
                    endIcon = R.drawable.next_arrow,
                    color = R.color.gainsboro
                )
            )
            it.add(
                SettingsClass(
                    startIcon = R.drawable.payment,
                    name = "Payment",
                    additionalInfo = "",
                    endIcon = R.drawable.next_arrow,
                    color = R.color.gainsboro
                )
            )
            it.add(
                SettingsClass(
                    startIcon = R.drawable.security,
                    name = "Security",
                    additionalInfo = "",
                    endIcon = R.drawable.next_arrow,
                    color = R.color.gainsboro
                )
            )
            it.add(
                SettingsClass(
                    startIcon = R.drawable.ic_language,
                    name = "Language",
                    additionalInfo = "English (US)",
                    endIcon = R.drawable.next_arrow,
                    color = R.color.gainsboro
                )
            )
            it.add(
                SettingsClass(
                    startIcon = R.drawable.eye,
                    name = "Dark Mode",
                    additionalInfo = "",
                    endIcon = R.drawable.next_arrow,//shesacvlelia
                    color = R.color.gainsboro
                )
            )
            it.add(
                SettingsClass(
                    startIcon = R.drawable.privacy_policy,
                    name = "Privacy Policy",
                    additionalInfo = "",
                    endIcon = R.drawable.next_arrow,
                    color = R.color.gainsboro
                )
            )
            it.add(
                SettingsClass(
                    startIcon = R.drawable.ic_help_center,
                    name = "Help Center",
                    additionalInfo = "",
                    endIcon = R.drawable.next_arrow,
                    color = R.color.gainsboro
                )
            )
            it.add(
                SettingsClass(
                    startIcon = R.drawable.invite,
                    name = "Invite Friends",
                    additionalInfo = "",
                    endIcon = R.drawable.next_arrow,
                    color = R.color.gainsboro
                )
            )
            it.add(
                SettingsClass(
                    startIcon = R.drawable.log_out,
                    name = "Log Out",
                    additionalInfo = "",
                    endIcon = 0,
                    color = R.color.FieryCoral
                )
            )
        }
    }
}