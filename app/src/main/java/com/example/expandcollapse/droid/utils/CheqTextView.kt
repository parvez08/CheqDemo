package com.example.expandcollapse.droid.utils
import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView


class CheqTextView : AppCompatTextView {
    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(
        context!!, attrs, defStyle
    ) {
        init(attrs)
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(
        context!!, attrs
    ) {
        init(attrs)
    }

    constructor(context: Context?) : super(context!!) {
        init(null)
    }

    private fun init(attrs: AttributeSet?) {
        if (attrs != null) {
         /*   val a = context.obtainStyledAttributes(attrs, R.styleable.OpenSansTextView)
            when (a.getInt(R.styleable.OpenSansTextView_kFontStyle, 2)) { // 2 is regular
                1 -> setTypeface(CustomFont.semiBold)
                2 -> setTypeface(CustomFont.regular)
                3 -> setTypeface(CustomFont.light)
                4 -> setTypeface(CustomFont.semiBold)
                5 -> setTypeface(CustomFont.italic)
                else -> setTypeface(CustomFont.regular)
            }
            a.recycle()*/
        }
    }
}
