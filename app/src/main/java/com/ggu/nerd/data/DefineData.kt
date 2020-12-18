package com.ggu.nerd.data

import android.Manifest

val PERMISSIONS = arrayOf(
    Manifest.permission.READ_EXTERNAL_STORAGE,
    Manifest.permission.CAMERA
)


object Url {
    const val URL_MINI_API = "https://miniapi.imbc.com/"
    const val URL_MINI_PLAY_API = "http://miniplay.imbc.com/"
    const val URL_MINI_VERSION = "http://mini.imbc.com/miniappversion/miniappversion.html"
    const val URL_MINI_CONTROL_ROOTING = "http://mini.imbc.com/rooting_And_3-1-6.html"
    const val URL_MINI_CONTROL_AD = "http://mini.imbc.com/Addoff_And_4-0-5.html"
    const val URL_MINI_BANNER_INTRO =
        "http://mini.imbc.com/intropromotion/intropromotion.html"
    const val URL_MINI_POLICY = "http://m.imbc.com/notice/privacy.html?IsApp=Y"
    const val URL_MINI_TERMS = "http://m.imbc.com/wiz/radio/manual/index.html"

    //        public static final String MINI_ONAIR_ADDR_DETAIL = " http://mini.imbc.com/index_v3.html?channel=";
    const val MINI_ONAIR_ADDR_DETAIL = "http://mini.imbc.com/webapp_v3/mini.html?channel="
    const val MINI_PODCAST_ADDR_DETAIL =
        "http://mini.imbc.com/index_v3.html?service=podcast&program="
}


object SharedPreferences {
    const val PREF_NOT_SETTING = -1
    const val PREF_KEY_APP_VERSION = "APP_VERSION"
    const val PREF_KEY_ROOTING_CHECK_STATE = "ROOTING_CHECK_OFF"
    const val PREF_KEY_PERMISSION = "SHOWN_APP_OPS_GUIDE"
    const val PREF_KEY_POWER_SAVING_MODE = "SHOWN_ULTRA_POWER_SAVING_MODE_GUIDE"
    const val PREF_KEY_TUTORIAL = "APP_TUTORIAL"
    const val PREF_KEY_SHOW_AUDIO_AD = "AD_AUDIO_CHECK"
    const val PREF_KEY_SHOW_IMAGE_AD = "AD_IMAGE_CHECK"
    const val PREF_KEY_PROMOTION_NOT_SHOW_DATE = "PROMOTION_VISIBILITY"
    const val PREF_KEY_NOTICE_VISIBLE = "PREF_NOTICE_VISIBLE"
    const val PREF_KEY_NETWORK_CHECK = "PREF_NETWORK_SETTING"
    const val BUNDLE_KEY_ALARM_DATA = "ALARM_DATA"
    const val PREF_KEY_LAST_CHANNEL = "LAST_CHANNEL"
    const val PREF_KEY_ALARM_START_CHANNEL = "PREF_SETTING_ALRAM_CHANNEL"
    const val PREF_KEY_ALARM_START_HOUR = "PREF_SETTING_ALRAM_HOUR"
    const val PREF_KEY_ALARM_START_MINUTE = "PREF_SETTING_ALRAM_MINUTE"
    const val PREF_KEY_ALARM_START_DAYS = "PREF_SETTING_ALRAM_DAYS" // boolean array
    const val PREF_KEY_ALARM_FINISH_HOUR = "PREF_RESERVATION_HOUR"
    const val PREF_KEY_ALARM_FINISH_MINUTE = "PREF_RESERVATION_MINUTE"
}

object RequestCode {
    const val REQ_CODE_PERMISSION = 100 // Intro에서 Permission으로
    const val REQ_CODE_PERMISSION_SETTING = 101 // Permission에서 App 설정으로
    const val REQ_CODE_POWER_SAVE = 300
    const val REQ_CODE_VERSION_UPDATE = 400
}
