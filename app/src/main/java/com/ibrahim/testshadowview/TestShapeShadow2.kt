package com.ibrahim.testshadowview

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.*
import android.graphics.Shader.TileMode
import android.util.AttributeSet
import com.google.android.material.button.MaterialButton


class TestShapeShadow2 : MaterialButton {
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        // ...
    }

    constructor(context: Context, attrs: AttributeSet) : this(context, attrs, 0) {}


    var paint: Paint? = null
    var mainColor = 0
    var mShadowColor = 0

    // shadow properties
    var offsetX = -25
    var offsetY = 30
    var blurRadius = 5

    init {
        mainColor = Color.RED
        mShadowColor = Color.BLACK // this color can also have alpha
        paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint!!.style = Paint.Style.FILL
    }

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas) {

        super.onDraw(canvas)
        val w = width
        val h = height
        val p = Paint(Paint.ANTI_ALIAS_FLAG or Paint.FILTER_BITMAP_FLAG)
        val pth = Path()
        val height = h.toFloat()
        val width = w.toFloat()
        pth.moveTo(100f, -100f)
        pth.lineTo(width, 0f)
        pth.lineTo(width, height)
        pth.lineTo(0f, height)
        pth.lineTo(0f, 0f)
        p.color = -0x800000
        p.shader = LinearGradient(
            0f,
            0f,
            0f,
            h.toFloat(),
            -0x1,
            -0x1000000,

            TileMode.CLAMP
        )
        canvas.drawPath(pth, p)
    }


}

