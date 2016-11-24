package com.autoadapterview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * 项目名称 autoadapterview
 * 创建时间 2016/11/23
 * csdn 博客 http://blog.csdn.net/qq_28268507
 * Author mi
 */

public class AutoAdapterTextView extends TextView {

    private float ration = 0;
    private int anchor;
    private final int WIDTH_ANCHOR = 1;
    private final int HEIGHT_ANCHOR = 2;

    public AutoAdapterTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.AutoAdpaterStyleable);
        ration = typedArray.getFloat(R.styleable.AutoAdpaterStyleable_ratio, ration);
        anchor = typedArray.getInt(R.styleable.AutoAdpaterStyleable_anchor, WIDTH_ANCHOR);
        typedArray.recycle();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        if (widthMode == MeasureSpec.EXACTLY && heightMode == MeasureSpec.EXACTLY) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else if (anchor == WIDTH_ANCHOR && widthMode == MeasureSpec.EXACTLY && ration > 0) {
            int height = MeasureSpec.makeMeasureSpec((int) (widthSize * ration + 0.5f), MeasureSpec.EXACTLY);
            super.onMeasure(widthMeasureSpec, height);
        } else if (anchor == HEIGHT_ANCHOR && heightMode == MeasureSpec.EXACTLY && ration > 0) {
            int width = MeasureSpec.makeMeasureSpec((int) (heightSize * ration + 0.5f), MeasureSpec.EXACTLY);
            super.onMeasure(width, heightMeasureSpec);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
