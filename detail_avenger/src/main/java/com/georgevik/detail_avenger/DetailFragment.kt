package com.georgevik.detail_avenger

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.georgevik.domain.Avenger
import com.google.gson.Gson
import kotlinx.android.synthetic.main.detail_fragment.*

class DetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.detail_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getParameters()?.let {
            avenger_name.text = it.name
        }
    }

    private fun getParameters(): Avenger? {
        arguments?.let {
            return Gson().fromJson(it.getString(PARAM_AVENGER), Avenger::class.java)
        }

        return null
    }

    companion object {
        private const val PARAM_AVENGER = "PARAM_AVENGER"

        fun build(avenger: Avenger) = DetailFragment().apply {
            arguments = Bundle().apply {
                this.putString(PARAM_AVENGER, Gson().toJson(avenger))
            }
        }
    }

}