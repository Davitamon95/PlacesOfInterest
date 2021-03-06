package com.example.placesofinterest

import Place
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_place.view.*


/**
 *Class aangemaakt die in de constructor een variable heeft geinitialiseeerd Bestaande uit een
 * lijst van de data class Place
 *Hierin wordt de viewholder gekoppeld
 */
public class PlaceAdapter(private val places: List<Place>) :
    RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return places.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(places[position])
    }

    /**
     * inner class om  de image en naam te verbinden aan de imageview en textview
     */
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(place : Place) {
            itemView.ivplace.setImageResource(place.imageResId)
            itemView.tvplace.text = place.name
        }
    }
}