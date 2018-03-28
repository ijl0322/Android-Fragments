package com.raywenderlich.listmaker.listmaker

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by isabellee on 3/28/18.
 */
class ListItemRecyclerViewAdapter(var list: TaskList): RecyclerView.Adapter<ListItemViewHolder>() {
    override fun getItemCount(): Int {
         return list.tasks.size
    }

    override fun onBindViewHolder(holder: ListItemViewHolder?, position: Int) {
        if (holder != null) {
            holder.taskTextView.text = list.tasks[position]
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListItemViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.task_view_holder, parent, false)
        return ListItemViewHolder(view)
    }
}