package com.example.fposcreenone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fposcreenone.R
import com.example.fposcreenone.model.NewsEventsModel2
import kotlinx.android.synthetic.main.news_events_list_two.view.*


class NewsEventsAdapter2(private val myDataSet: List<NewsEventsModel2>?) :
    RecyclerView.Adapter<NewsEventsAdapter2.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {


        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.news_events_list_two, parent, false)
        return MyViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {

        return myDataSet!!.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.title.text = myDataSet!![position].newsEventsTitle

        holder.name.text = myDataSet[position].newsEventsName

        holder.newsDate.text = myDataSet[position].newsDate

        holder.eventsDate.text = myDataSet[position].eventsDate

        holder.thumbnail.setImageDrawable(myDataSet[position].newsEventsThumbnail)




    }


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var title: AppCompatTextView = view.tvNewsEventsTitle

        var name: AppCompatTextView = view.tvNewsEventsName

        var newsDate: AppCompatTextView = view.tvNewsDate

        var eventsDate: AppCompatTextView = view.tvEventsDate

        var thumbnail: AppCompatImageView = view.ivNewsEventsThumbnail

    }
}