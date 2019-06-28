package com.georgevik.list_avengers

import dagger.Subcomponent

@Subcomponent
interface ListAvengersComponent {

    fun inject(activity: ListActivity)

    fun inject(fragment: ListAvengerFragment)

    interface Provider {
        fun provide(): ListAvengersComponent
    }
}