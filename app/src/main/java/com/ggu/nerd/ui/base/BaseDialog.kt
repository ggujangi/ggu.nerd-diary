package com.ggu.nerd.ui.base

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import androidx.annotation.LayoutRes
import com.ggu.nerd.R

abstract class BaseDialog(context: Context?) : AlertDialog(context, R.style.Dialog) {

    /**
     * @return layout resource id
     */
    @LayoutRes
    abstract fun getLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())

    }
}