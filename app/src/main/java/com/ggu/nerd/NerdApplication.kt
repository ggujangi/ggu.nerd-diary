package com.ggu.nerd

import androidx.multidex.MultiDexApplication

class NerdApplication : MultiDexApplication(){
    override fun onCreate() {
        super.onCreate()
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
    }
}