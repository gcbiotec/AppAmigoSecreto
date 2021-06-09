package com.example.appamigosecreto.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appamigosecreto.model.projection.ParticipanteProjection
import com.example.appamigosecreto.model.utils.CardListener

class ParticipanteAdapter(
    var participanteProjectionList: List<ParticipanteProjection>,
    val cardListener: CardListener
) :
    RecyclerView.Adapter<ParticipanteAdapter.ViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemAccountBinding.inflate(layoutInflater, parent, false)
            return ViewHolder(binding)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(participanteProjectionList[position], cardListener)
        }

        override fun getItemCount(): Int = participanteProjectionList.size

        class ViewHolder(val itemParticipanteBinding: ItemAccountBinding) : RecyclerView.ViewHolder(itemAccountBinding.root) {
            fun bind(item: ParticipanteProjection, cardListener: CardListener) {
                itemAccountBinding.accountProjection = item
                itemAccountBinding.cardListener = cardListener
                itemAccountBinding.executePendingBindings()
            }
        }
    }
}