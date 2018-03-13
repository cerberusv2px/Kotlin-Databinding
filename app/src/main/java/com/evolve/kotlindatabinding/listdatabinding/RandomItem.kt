package com.evolve.kotlindatabinding.listdatabinding

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.evolve.kotlindatabinding.BR

/**
 * Created by sujin on 3/11/18.
 */

data class RandomItem(
        private val _name: String,
        private val _age: String,
        private val _showAge: Boolean) : BaseObservable() {

    @Bindable
    var name = _name
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

    @Bindable
    var age = _age
        set(value) {
            field = value
            notifyPropertyChanged(BR.age)
        }

    @Bindable
    var showAge = _showAge
        set(value) {
            field = value
            notifyPropertyChanged(BR.showAge)
        }
}