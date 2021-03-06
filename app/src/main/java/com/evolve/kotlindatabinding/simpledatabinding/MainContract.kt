package com.evolve.kotlindatabinding.simpledatabinding

/**
 * Created by sujin on 2/23/18.
 */
interface MainContract {

    interface Presenter {
        fun onShowData(temperature: Temperature)
    }

    interface View {
        fun showData(temperature: Temperature)
    }
}