package com.example.assignment10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment10.databinding.SettingsRecyclerviewBinding


class SettingsRecyclerAdapter(private val settingsList: MutableList<SettingsClass>) :
    RecyclerView.Adapter<SettingsRecyclerAdapter.SettingsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SettingsViewHolder {
        return SettingsViewHolder(
            SettingsRecyclerviewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return settingsList.size
    }

    override fun onBindViewHolder(holder: SettingsViewHolder, position: Int) {
        val setting = settingsList[position]
        holder.binding.startIcon.setImageResource(setting.startIcon)
        holder.binding.mainText.text = setting.name
        holder.binding.addInfo.text = setting.additionalInfo
        holder.binding.endIcon.setImageResource(setting.endIcon)
    }


    inner class SettingsViewHolder(val binding: SettingsRecyclerviewBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }
}