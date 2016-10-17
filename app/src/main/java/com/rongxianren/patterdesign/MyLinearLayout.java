package com.rongxianren.patterdesign;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by wty on 16/9/24.
 */
public class MyLinearLayout extends LinearLayout {
    public MyLinearLayout(Context context) {
        this(context, null);
    }

    public MyLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        System.out.println("--------onMeasure------- = " + MeasureSpec.getSize(widthMeasureSpec));
    }
}
