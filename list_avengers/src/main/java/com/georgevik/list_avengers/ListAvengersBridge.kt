package com.georgevik.list_avengers

import android.app.Activity
import com.georgevik.domain.Avenger

interface ListAvengersBridge {

    fun goToDetail(activity: Activity, avenger: Avenger, requestCode: Int = 0)

}