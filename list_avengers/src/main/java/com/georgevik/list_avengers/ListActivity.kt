package com.georgevik.list_avengers

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_activity)

        getListAvengersComponent().inject(this)

        if (savedInstanceState == null) {
            startFragment()
        }
    }

    private fun getListAvengersComponent(): ListAvengersComponent {
        return (applicationContext as ListAvengersComponent.Provider).provide()
    }

    private fun startFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.frame, ListAvengerFragment())
            .commit()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}