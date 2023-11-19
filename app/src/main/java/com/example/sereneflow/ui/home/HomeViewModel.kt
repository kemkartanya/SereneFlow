package com.example.sereneflow.ui.home

import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sereneflow.R

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Welcome to Serene Flow!"
    }
    val text: LiveData<String> = _text


}