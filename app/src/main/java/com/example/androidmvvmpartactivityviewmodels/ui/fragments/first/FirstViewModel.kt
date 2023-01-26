package com.example.androidmvvmpartactivityviewmodels.ui.fragments.first

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androidmvvmpartactivityviewmodels.data.model.Model

class FirstViewModel : ViewModel() {

    private val _errorLiveData = MutableLiveData<List<Model>>()
    val errorLiveData: LiveData<List<Model>> = _errorLiveData

    private val noteList = mutableListOf<Model>()

    fun addNote(title: String, description: String){
        noteList.add(Model(title = title, description = description))
        _errorLiveData.value = noteList.toList()
    }
}