package com.example.myapplication.UI

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.Api.ResponseDTOItem
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemLayoutBinding

class CharecterAdapter() :
    PagingDataAdapter<ResponseDTOItem, CharecterAdapter.MovieViewHolder>(diffUtil) {

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<ResponseDTOItem>() {

            override fun areItemsTheSame(
                oldItem: ResponseDTOItem,
                newItem: ResponseDTOItem
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: ResponseDTOItem,
                newItem: ResponseDTOItem
            ): Boolean {
                return oldItem.equals(newItem)
            }

        }
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val result = getItem(position)
        result.let {
            if (it != null) {
                holder.setData(it)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemLayoutBinding:ItemLayoutBinding =
            DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.item_layout,parent,false)
        return MovieViewHolder(itemLayoutBinding)
    }


    class MovieViewHolder(val itemLayoutBinding: ItemLayoutBinding) : RecyclerView.ViewHolder(itemLayoutBinding.root) {
        fun setData(responseDTOItem: ResponseDTOItem) {
            itemLayoutBinding.responseItem=responseDTOItem
            Glide.with(itemLayoutBinding.ivImage).load(responseDTOItem.image.original).into(itemLayoutBinding.ivImage)
        }
    }
//        fun setData(model: ResponseDTOItem?) {
//
//            Glide.with(PersonImage).load(model?.image?.medium).into(PersonImage)
//            if (model?.country == null) {
//                CountryName.isVisible = false
//            } else {
//                CountryName.text = "Country - ${model?.country}"
//            }
//            if (model?.birthday == null) {
//                birthDate.isVisible = false
//            } else {
//                birthDate.text = "Birth Date - ${model?.birthday}"
//            }
//            if (model?.deathday == null) {
//                deathDate.isVisible = false
//            } else {
//                deathDate.text = "Death day - ${model?.deathday}"
//            }
//            if (model?.id == null) {
//                id.isVisible = false
//            }
//            id.text = " Id - ${model?.id}"
//
//        }

    }


