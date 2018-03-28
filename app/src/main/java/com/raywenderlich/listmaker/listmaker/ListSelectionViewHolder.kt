package com.raywenderlich.listmaker.listmaker

import android.support.v7.widget.RecyclerView
import android.widget.TextView
import android.view.View

/**
 * Created by isabellee on 3/28/18.
 */
class ListSelectionViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView){
    val listPosition = itemView?.findViewById<TextView>(R.id.itemNumber) as TextView
    val listTitle = itemView?.findViewById<TextView>(R.id.itemString) as TextView
}