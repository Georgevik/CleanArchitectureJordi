package com.georgevik.detail_avenger

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.georgevik.domain.Avenger
import com.google.gson.Gson

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        if (savedInstanceState == null) {
            startFragment()
        }

    }

    private fun getParameters(): Parameters {
        val stringExtra = intent.getStringExtra(EXTRA_PARAMETERS) ?: throw Exception()

        return Gson().fromJson(stringExtra, Parameters::class.java)
    }


    private fun startFragment() {

        supportFragmentManager.beginTransaction()
            .add(R.id.frame, DetailFragment.build(getParameters().avenger))
            .commit()
    }

    companion object {
        private const val EXTRA_PARAMETERS = "EXTRA_PARAMETERS"

        fun buildIntent(context: Context, parameters: Parameters) = Intent(context, DetailActivity::class.java).apply {
            putExtra(EXTRA_PARAMETERS, Gson().toJson(parameters))
        }
    }

    data class Parameters constructor(val avenger: Avenger)
}