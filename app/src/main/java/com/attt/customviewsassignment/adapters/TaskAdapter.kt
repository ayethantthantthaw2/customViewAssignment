package com.attt.customviewsassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.attt.customviewsassignment.R
import com.attt.customviewsassignment.Views.viewholders.TaskViewHolder
import com.attt.customviewsassignment.delegates.ProfileDelegate

class TaskAdapter(private val mDelegate: ProfileDelegate) : RecyclerView.Adapter<TaskViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_task, parent, false)
        return TaskViewHolder(view)

    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}