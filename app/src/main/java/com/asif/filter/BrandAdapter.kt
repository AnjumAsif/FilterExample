package com.asif.filter

import android.content.Context
import android.graphics.Color
import android.graphics.Color.parseColor
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_brand.view.*

class BrandAdapter(var mCtx: Context, var onClickListener: OnClickListener) :
    RecyclerView.Adapter<BrandAdapter.BrandViewHolder>() {
    var count: Int = -1
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrandViewHolder {
        return BrandViewHolder(
            LayoutInflater.from(mCtx).inflate(
                R.layout.item_brand,
                parent,
                false
            )

        )
    }

    override fun getItemCount(): Int {
        return 12
    }

    override fun onBindViewHolder(holder: BrandViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            onClickListener.onItemClick(position)
            count = position
            notifyDataSetChanged()
        }
        if (count == position) holder.layoutItemSection.background.setTint(parseColor("#ff8800")) else
            holder.layoutItemSection.background.setTint(parseColor("#b3b3b3"))
    }

    class BrandViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var layoutItemSection = view.layoutItem

    }
}