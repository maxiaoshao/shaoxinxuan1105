package com.bwie.shaoxinxuan1105;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 轩少 on 2018/11/5.
 */

public class LuckPan extends View {
    private  Paint Dpaint;  //大圆画笔
    private  int DX = 300;
    private  int DY = 300;
    private  int Dradis =150;
    //——————————————————————————
    private  Paint Xpaint;  //小圆画笔
    private  int XX = 100;
    private  int XY = 100;
    private  int Xradis =50;

    public LuckPan(Context context) {
        super(context,null);
    }

    public LuckPan(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs,0);
    }

    public LuckPan(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
         Dpaint = new Paint();
         Xpaint = new Paint();

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //绘制大圆
        Canvas canvas1 = new Canvas();
        canvas1.drawCircle(DX,DY,Dradis,Dpaint);
        Dpaint.setColor(Color.BLUE);
        //绘制小圆
        Canvas canvas2 = new Canvas();
        canvas2.drawCircle(XX,XY,Xradis,Xpaint);
        Xpaint.setColor(Color.GRAY);


    }
}
