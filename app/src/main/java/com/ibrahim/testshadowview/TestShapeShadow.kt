package com.ibrahim.testshadowview

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.*
import android.graphics.Shader.TileMode
import android.util.AttributeSet
import android.util.Log
import com.google.android.material.button.MaterialButton


class TestShapeShadow : MaterialButton {
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

        // Draw main object
        val w = measuredWidth
        val h = measuredHeight
        looog("$w")
        looog("$h")

        looog("$x")
        looog("$y")

        looog("$width")
        looog("$height")


        val x1 = 0f
        val y1 = 0f
        val x2 = 100f
        val y2 = 40f
        val shader: Shader = LinearGradient(
            x1,
            y1,
            x2,
            y2,
            Color.WHITE,
            Color.BLACK,
            TileMode.CLAMP
        )
        val paint = Paint()
        paint.shader = shader
        canvas.drawRect(width.toFloat(), -50f, 0f, 20f, paint!!)

//        canvas.drawRect(RectF(x1, -y1, x2, y2), paint)

    }


}


fun looog(s: String){
    Log.d("TAGTAG", "looog: $s")
}
