package com.evolve.kotlindatabinding.listdatabinding

import android.databinding.BindingAdapter
import android.view.View
import android.widget.TextView

/**
 * Created by sujin on 3/11/18.
 */

@BindingAdapter("show")
fun setVisibility(textView: TextView, show: Boolean) {
    textView.visibility = if (show) View.VISIBLE else View.GONE
}

