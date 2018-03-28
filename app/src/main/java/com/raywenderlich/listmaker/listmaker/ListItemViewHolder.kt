package com.raywenderlich.listmaker.listmaker

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

/**
 * Created by isabellee on 3/28/18.
 */
class ListItemViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    val taskTextView = itemView?.findViewById<TextView>(R.id.textview_task) as TextView
}