package com.evolve.kotlindatabinding.listdatabinding

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.evolve.kotlindatabinding.R
import com.evolve.kotlindatabinding.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityListBinding>(this, R.layout.activity_list)

        // setContentView(R.layout.activity_list)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val randomAdapter = RandomAdapter(getData())
        recyclerView.adapter = randomAdapter
        Log.e("asdf","sdfsdfsdf")

    }

    private fun getData(): List<RandomItem> {
        return listOf(
                RandomItem("AsDfe", "34", true),
                RandomItem("Ddfs", "34", false),
                RandomItem("sdfs", "14", true)
        )
    }
}
