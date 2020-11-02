package com.example.fposcreenone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fposcreenone.R
import com.example.fposcreenone.model.TrendingNowModel
import kotlinx.android.synthetic.main.trending_now_list.view.*

class TrendingNowAdapter(private val myDataSet: List<TrendingNowModel>?) :
    RecyclerView.Adapter<TrendingNowAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {


        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.trending_now_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {

        return myDataSet!!.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.title.text = myDataSet!![position].trendingNowTitle
        holder.instituteType.text = myDataSet[position].trendingNowInstituteType
        holder.time.text = myDataSet[position].trendingNowTime
        holder.image.setImageDrawable(myDataSet[position].trendingNowImage)

        if(position%2!=0)
        {
            holder.line.visibility=View.INVISIBLE
        }

        else {
            holder.line.visibility=View.VISIBLE
        }

    }


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var title: AppCompatTextView = view.tvTrendingNowTitle

        var instituteType: AppCompatTextView = view.tvTrendingNowInstituteType


        var time: AppCompatTextView = view.tvTrendingNowTime

        var image: AppCompatImageView = view.ivTrendingNowImage

        var line: AppCompatImageView = view.ivTrendingNowDivider
    }
}


