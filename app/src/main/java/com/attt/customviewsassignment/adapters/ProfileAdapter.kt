package com.attt.customviewsassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.attt.customviewsassignment.R
import com.attt.customviewsassignment.Views.viewholders.ProfileViewHolder
import com.attt.customviewsassignment.delegates.ProfileDelegate

class ProfileAdapter(val mProfilesDelegate: ProfileDelegate): RecyclerView.Adapter<ProfileViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.viewholder_profile,parent,false)
        return ProfileViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3

    }
}