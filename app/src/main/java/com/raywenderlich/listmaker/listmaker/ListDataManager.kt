package com.raywenderlich.listmaker.listmaker

import android.content.Context
import android.preference.Preference
import android.preference.PreferenceManager

/**
 * Created by isabellee on 3/28/18.
 */
class ListDataManager(val context: Context) {
    fun saveList(list: TaskList) {
        val sharedPreference = PreferenceManager.getDefaultSharedPreferences(context).edit()
        sharedPreference.putStringSet(list.name, list.tasks.toHashSet())
        sharedPreference.apply()
    }

    fun readLists(): ArrayList<TaskList> {
        val sharedPreference = PreferenceManager.getDefaultSharedPreferences(context)
        val sharePreferenceContents = sharedPreference.all
        val taskLists = ArrayList<TaskList>()
        for (preferenceItem in sharePreferenceContents) {
            val itemHashSet = preferenceItem.value as HashSet<String>
            val list = TaskList(preferenceItem.key, ArrayList(itemHashSet))
            taskLists.add(list)
        }
        return taskLists
    }
}