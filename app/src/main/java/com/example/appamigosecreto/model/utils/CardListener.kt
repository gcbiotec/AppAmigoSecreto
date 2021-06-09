package com.example.appamigosecreto.model.utils

import android.view.View
import androidx.databinding.BindingAdapter

class CardListener(
    val clickListener: (param: Any) -> Unit,
    val longClickListener: (param: Any) -> Unit
) {

    fun onClick(param: Any) = clickListener(param)

    fun onLongClick(param: Any) = longClickListener(param)

    companion object {
        private const val ON_LONG_CLICK = "android:onLongClick"

        @JvmStatic
        @BindingAdapter(ON_LONG_CLICK)
        fun setOnLongClickListener(view: View, func:() -> Unit){
            view.setOnLongClickListener {
                func()
                return@setOnLongClickListener true
            }
        }
    }

}