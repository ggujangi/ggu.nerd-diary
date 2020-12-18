package com.ggu.nerd.ui.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

public abstract class BaseViewModel : ViewModel() {
    private var isLoading : MutableLiveData<Boolean> = MutableLiveData<Boolean>(false)
    get() = isLoading

    public fun setIsLoading(loading:Boolean){
        isLoading.value = loading
    }
}