package com.example.expandcollapse.droid.utils

import android.content.Context
import android.graphics.Typeface

object CustomFont {
    private var boldFont: Typeface? = null
    private var regularFont: Typeface? = null
    private var lightFont: Typeface? = null
    private var semiboldFont: Typeface? = null
    private var italicFont: Typeface? = null
    private var isInitiated = false
    @Throws(Exception::class)
    fun init(context: Context) {
        try {
            if (!isInitiated) {
                boldFont = Typeface.createFromAsset(context.assets, "poppins_bold.ttf")
                regularFont =
                    Typeface.createFromAsset(context.assets, "poppins_regular.ttf")
                lightFont = Typeface.createFromAsset(context.assets, "poppins_light.ttf")
                semiboldFont =
                    Typeface.createFromAsset(context.assets, "poppins_semibold.ttf")
                italicFont =
                    Typeface.createFromAsset(context.assets, "poppins_italic.ttf")
                isInitiated = true
            }
        } catch (e: Exception) {
            val tf: Typeface? = null
            boldFont = Typeface.create(tf, Typeface.BOLD)
            regularFont = Typeface.create(tf, Typeface.NORMAL)
            lightFont = Typeface.create(tf, Typeface.NORMAL)
            semiboldFont = Typeface.create(tf, Typeface.BOLD)
            italicFont = Typeface.create(tf, Typeface.ITALIC)
            throw Exception("Fonts Failed to initialize")
        }
    }

    val semiBold: Typeface?
        get() = semiboldFont
    val bold: Typeface?
        get() = boldFont
    val light: Typeface?
        get() = lightFont
    val regular: Typeface?
        get() = regularFont
    val italic: Typeface?
        get() = italicFont
}

