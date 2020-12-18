package com.ggu.nerd.data.source

interface LoadDataCallback<T> {
    fun onDataLoaded(data:T)
    fun onFailed(error:String)
}