package com.ggu.nerd.ui.intro

import android.os.Bundle
import com.ggu.nerd.R
import com.ggu.nerd.databinding.ActivityIntroBinding
import com.ggu.nerd.ui.base.BaseActivity

class IntroActivity : BaseActivity<ActivityIntroBinding, IntroViewModel>() {

    override fun getLayoutId(): Int = R.layout.activity_intro

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}