package com.georgevik.cleanarchitecturejordi.bridge

import android.app.Activity
import com.georgevik.detail_avenger.DetailActivity
import com.georgevik.domain.Avenger
import com.georgevik.list_avengers.ListAvengersBridge
import javax.inject.Inject

class ListAvengersBridgeImpl @Inject constructor() : ListAvengersBridge {

    override fun goToDetail(activity: Activity, avenger: Avenger, requestCode: Int) {
        val intent = DetailActivity.buildIntent(activity, DetailActivity.Parameters(avenger))
        activity.startActivityForResult(intent, requestCode)
    }
}