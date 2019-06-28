package com.georgevik.list_avengers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.georgevik.domain.useCase.GetAllAvengersUseCase
import kotlinx.android.synthetic.main.list_avenger_fragment.*
import javax.inject.Inject

class ListAvengerFragment : Fragment() {

    @Inject
    lateinit var getAllAvengersUseCase: GetAllAvengersUseCase

    @Inject
    lateinit var bridge: ListAvengersBridge

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.list_avenger_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getListAvengersComponent().inject(this)

        button_avenger.setOnClickListener {
            getAllAvengersUseCase.run(Unit).subscribe({
                bridge.goToDetail(activity!!, it.random())
            }, {})
        }
    }

    private fun getListAvengersComponent(): ListAvengersComponent {
        return (context?.applicationContext as ListAvengersComponent.Provider).provide()
    }
}