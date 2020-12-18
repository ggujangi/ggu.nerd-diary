package com.ggu.nerd.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.ggu.nerd.utils.setLightStatusBar

public abstract class BaseActivity<T : ViewDataBinding, V:BaseViewModel> : AppCompatActivity() {

    protected lateinit var binding:T
    protected lateinit var viewModel:V

    /**
     * @return layout resource id
     */
    @LayoutRes
    abstract fun getLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getLayoutId())
        binding.executePendingBindings()
    }

    override fun onResume() {
        super.onResume()
        setLightStatusBar(this)
    }
}