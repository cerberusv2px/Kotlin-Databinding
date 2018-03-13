package com.evolve.kotlindatabinding.simpledatabinding

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.evolve.kotlindatabinding.R
import com.evolve.kotlindatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainContract.View {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val temp = Temperature("Kathmandu", "36C")
        val mainPresenter = MainPresenter(applicationContext, this)

        mainBinding.temp = temp
        mainBinding.presenter = mainPresenter

    }

    override fun showData(temperature: Temperature) {
        Toast.makeText(applicationContext, temperature.celsius, Toast.LENGTH_LONG).show()
    }
}
