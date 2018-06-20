package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint mPaint;

    public Practice10HistogramView(Context context) {
        this(context, null);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


        init();
    }

    private void init() {
        mPaint = new Paint();

    }


    private int width = 700;
    private int height = 500;
    private int def = 100;

    private int end = def + height;

    private int per = 100;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        // 长700  高 500

        mPaint.setStrokeWidth(5);
        mPaint.setStyle(Paint.Style.FILL);

        canvas.drawLine(def, def, def, def + height, mPaint);
        canvas.drawLine(def, def + height, def + width + 10, def + height , mPaint);


        mPaint.setStyle(Paint.Style.FILL);

        RectF rectF;
        for (int i = 1; i < 8; i++) {

            mPaint.setColor(Color.BLUE);
            rectF = new RectF(def * i + 10, end - 30 * i, def * i + per, end);
            canvas.drawRect(rectF, mPaint);
            mPaint.setColor(Color.WHITE);
            mPaint.setTextSize(25);
            canvas.drawText("laogao" + i, def * i + 10, end + 25, mPaint);


        }


    }
}
