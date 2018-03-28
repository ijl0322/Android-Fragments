package com.raywenderlich.listmaker.listmaker

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by isabellee on 3/28/18.
 */
class TaskList(val name: String, val tasks: ArrayList<String> = ArrayList()) : Parcelable {

    constructor(source: Parcel): this(source.readString(), source.createStringArrayList())

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
        dest.writeStringList(tasks)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TaskList> {
        override fun createFromParcel(parcel: Parcel): TaskList = TaskList(parcel)

        override fun newArray(size: Int): Array<TaskList?> {
            return arrayOfNulls(size)
        }
    }
}