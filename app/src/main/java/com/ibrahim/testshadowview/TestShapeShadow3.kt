package com.ibrahim.testshadowview

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.Shader.TileMode
import android.util.AttributeSet
import com.google.android.material.button.MaterialButton


class TestShapeShadow3 : MaterialButton {
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

    var m_Paint = Paint()

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas) {
        // start at 0,0 and go to 0,max to use a vertical
        // gradient the full height of the screen.

        // start at 0,0 and go to 0,max to use a vertical
        // gradient the full height of the screen.
        m_Paint.setShader(
            LinearGradient(
                0f,
                0f,
                0f,
                height.toFloat(),
                Color.BLACK,
                Color.WHITE,
                TileMode.MIRROR
            )
        )

        canvas.drawRect(width.toFloat(), -50f, 0f, 0f, m_Paint!!)

        super.onDraw(canvas)
    }


}
