package com.evolve.kotlindatabinding

import android.databinding.BaseObservable
import android.databinding.Bindable

/**
 * Created by sujin on 2/23/18.
 */

data class Temperature(var _location: String, var _celsius: String) : BaseObservable() {

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