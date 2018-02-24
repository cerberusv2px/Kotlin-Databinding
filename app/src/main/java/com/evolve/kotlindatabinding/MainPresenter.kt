package com.evolve.kotlindatabinding

import android.content.Context

/**
 * Created by sujin on 2/23/18.
 */
class MainPresenter(val context: Context, val view: MainContract.View) : MainContract.Presenter {
    override fun onShowData(temperature: Temperature) {
        temperature.notifyChange()
        view.showData(temperature)
    }
}