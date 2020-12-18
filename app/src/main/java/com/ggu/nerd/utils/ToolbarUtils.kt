package com.ggu.nerd.utils

import android.app.Activity
import android.graphics.Color
import android.view.View
import android.view.WindowManager

fun setFullScreenToolbar(activity: Activity?) {
    if (activity == null) return
    val window = activity.window
    window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
    window.statusBarColor = Color.parseColor("#ffffff")
}

fun setCollapsingToolbar(activity: Activity?) {
    if (activity == null) return
    val window = activity.window
    window.decorView.systemUiVisibility = (
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
    window.statusBarColor = Color.parseColor("#00000000")
}

fun setLightStatusBar(activity: Activity?) {
    if (activity == null) return
    val window = activity.window
    window.decorView.systemUiVisibility =
        View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    window.clearFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
    window.statusBarColor = Color.parseColor("#ffffff")
}

fun getStatusBarHeight(activity: Activity): Int {
    var result = 0
    val resourceId =
        activity.resources.getIdentifier("status_bar_height", "dimen", "android")
    if (resourceId > 0) result = activity.getResources().getDimensionPixelSize(resourceId);
    /*if (resourceId > 0) result =
        activity.resources.getDimension(R.dimen.statusbarHeight).toInt()*/
    return result
}
