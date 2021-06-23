package com.ibrahim.testshadowview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;


public class MyView14 extends View {


    public MyView14(Context context) {
        super(context);
        init(null, 0);
    }

    public MyView14(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    private void init(AttributeSet attrs, int i) {

    }

    public MyView14(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    @Override

    public void onDraw(Canvas canvas) {

        Paint Pnt = new Paint();

        Pnt.setAntiAlias(true);

        int[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.WHITE};

        float[] pos = {0.0f, 0.1f, 0.6f, 0.9f, 1.0f};

        // 수평

        Pnt.setShader(new LinearGradient(0, 0, 100, 0,

                Color.BLUE, Color.WHITE, TileMode.CLAMP));

        canvas.drawRect(0, 0, 100, 100, Pnt);

        // 우하향

        Pnt.setShader(new LinearGradient(110, 0, 210, 100,

                Color.BLUE, Color.WHITE, TileMode.CLAMP));

        canvas.drawRect(110, 0, 210, 100, Pnt);

        // 우상향

        Pnt.setShader(new LinearGradient(220, 100, 320, 0,

                Color.BLUE, Color.WHITE, TileMode.CLAMP));

        canvas.drawRect(220, 0, 320, 100, Pnt);

        // 가장자리반복

        Pnt.setShader(new LinearGradient(0, 0, 100, 0,

                Color.BLUE, Color.WHITE, TileMode.CLAMP));

        canvas.drawRect(0, 110, 320, 150, Pnt);

        // 무늬반복

        Pnt.setShader(new LinearGradient(0, 0, 100, 0,

                Color.BLUE, Color.WHITE, TileMode.REPEAT));

//        canvas.drawRect(0, 160, 320, 200, Pnt);
//
//        // 무늬반사반복
//
//        Pnt.setShader(new LinearGradient(0, 0, 100, 0,
//
//                Color.BLUE, Color.WHITE, TileMode.MIRROR));
//
//        canvas.drawRect(0, 210, 320, 250, Pnt);
//
//        // 여러가지색상균등배치
//
//        Pnt.setShader(new LinearGradient(0, 0, 320, 0, colors, null, TileMode.CLAMP));
//
//        canvas.drawRect(0, 260, 320, 300, Pnt);
//
//        // 여러가지색상임의배치
//
//        Pnt.setShader(new LinearGradient(0, 0, 320, 0, colors, pos, TileMode.CLAMP));
//
//        canvas.drawRect(0, 310, 320, 350, Pnt);

    }


}
