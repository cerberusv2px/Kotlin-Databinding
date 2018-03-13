package com.evolve.kotlindatabinding.listdatabinding

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.evolve.kotlindatabinding.BR
import com.evolve.kotlindatabinding.R

/**
 * Created by sujin on 3/11/18.
 */
class RandomAdapter(private val randomList: List<RandomItem>)
    : RecyclerView.Adapter<RandomAdapter.RandomViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RandomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.item_random, parent, false)

        return RandomViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return randomList.size
    }

    override fun onBindViewHolder(holder: RandomViewHolder?, position: Int) {
        val randomItem = randomList[position]
        holder?.bind(randomItem)
        //BindingUtils.setVisibilty(holder!!.itemView.text_age, randomItem.showAge)
    }


    inner class RandomViewHolder(private val binding: ViewDataBinding)
        : RecyclerView.ViewHolder(binding.root) {

        fun bind(obj: kotlin.Any) {
            binding.setVariable(BR.obj, obj)
            binding.executePendingBindings()
        }
    }
}