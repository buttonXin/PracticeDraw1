package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint mPaint;

    public Practice11PieChartView(Context context) {
        this(context , null);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs , 0);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.BLUE);

    }
    private int range1 = 45 ;
    private int range2 = 10 ;
    private int range3 = 20 ;
    private int range4 = 15 ;
    private int range5 = 50 ;
    private int range6 = 100 ;
    private int range7 = 120 ;


    private float left = 200 ;
    private float top = 200 ;
    private float right = 600 ;
    private float bottom = 600 ;
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

//        canvas.drawArc(200 , 200 , 600 , 600 ,
//                0 , 360 , true , mPaint);

        canvasArc(canvas , 1 , range2 , Color.WHITE);
        canvasArc(canvas , 2 , range3 , Color.BLUE);
        canvasArc(canvas , 3 , range4 , Color.BLACK);
        canvasArc(canvas , 4 , range5 , Color.GRAY);
        canvasArc(canvas , 5 , range6 , Color.YELLOW);
        canvasArc(canvas , 6 , range7 , Color.RED);
        canvasArc(canvas , 7 , range1 , Color.GREEN);

    }

    private int start ;
    private void canvasArc(Canvas canvas,  int count, int end , int color) {


        mPaint.setColor(color);

        if (count == 6){

            canvas.drawArc(left -40 , top -50 , right  , bottom ,
                    start , end , true , mPaint);
        }else {

            canvas.drawArc(left , top , right , bottom,
                    start , end , true , mPaint);
        }

//        canvas.drawLine();
// todo
        //下面的那个划线 , 不会算位置，，这里先gg。。。

        start += end ;
    }
}
