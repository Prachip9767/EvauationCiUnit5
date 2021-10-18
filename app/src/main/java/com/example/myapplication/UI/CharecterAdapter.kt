package com.example.myapplication.UI

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.Api.ResponseDTOItem
import com.example.myapplication.R

class CharecterAdapter() : PagingDataAdapter<ResponseDTOItem, CharecterAdapter.MovieViewHolder>(diffUtil) {

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<ResponseDTOItem>() {

            override fun areItemsTheSame(oldItem: ResponseDTOItem, newItem: ResponseDTOItem): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: ResponseDTOItem, newItem:ResponseDTOItem): Boolean {
                return oldItem.equals(newItem)
            }

        }
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val result=getItem(position)
        result.let {
            if (it != null) {
                holder.setData(it)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return MovieViewHolder(view)
    }


    class MovieViewHolder(view: View): RecyclerView.ViewHolder(view){

        val PersonImage: ImageView =view.findViewById(R.id.ivImage)
        val CountryName : TextView =view.findViewById(R.id.tvCountryName)
        val deathDate: TextView =view.findViewById(R.id.tvdDate)
        val birthDate: TextView =view.findViewById(R.id.tvbDate)
        val id: TextView =view.findViewById(R.id.tvid)

        fun setData(model: ResponseDTOItem?){
            var pathImage="https://image.tmdb.org/t/p/w500"
            Glide.with(PersonImage).load(pathImage+model?.image).into(PersonImage)
            CountryName.text="Movie Name - ${model?.country}"
            deathDate.text="Language - ${model?.deathday}"
            birthDate.text="Released Date - ${model?.birthday}"
            id.text="Moive Id - ${model?.id}"

        }

    }

}
