package com.asif.filter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_filter.*
import kotlinx.android.synthetic.main.header.*

class FilterActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.imageViewClear -> {
                onBackPressed()
            }
            R.id.textViewDone -> {
                onBackPressed()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter)
        imageViewClear.setOnClickListener(this)
        recyclerViewBrand.layoutManager = GridLayoutManager(this, 3)
        recyclerViewBrand.adapter = BrandAdapter(this, object : OnClickListener {
            override fun onItemClick(pos: Int) {

            }
        })
    }
}
