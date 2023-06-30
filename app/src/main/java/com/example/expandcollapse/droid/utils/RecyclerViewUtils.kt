package com.example.expandcollapse.droid.utils

import android.view.View
import androidx.recyclerview.widget.RecyclerView

object RecyclerViewUtils {
    fun maximizeEfficiency(recyclerView: RecyclerView) {
        recyclerView.setHasFixedSize(true)
        recyclerView.setItemViewCacheSize(100)
        recyclerView.isDrawingCacheEnabled = true
        recyclerView.drawingCacheQuality = View.DRAWING_CACHE_QUALITY_HIGH
    }
}