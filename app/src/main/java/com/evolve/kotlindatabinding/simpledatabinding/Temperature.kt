package com.evolve.kotlindatabinding.simpledatabinding

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.evolve.kotlindatabinding.BR

/**
 * Created by sujin on 2/23/18.
 */

data class Temperature(private var _location: String, private var _celsius: String) : BaseObservable() {

    @Bindable
    var location: String = _location
        set(value) {
            field = value
            notifyPropertyChanged(BR.location)
        }

    @Bindable
    var celsius: String = _celsius
        set(value) {
            field = value
            notifyPropertyChanged(BR.celsius)
        }
}