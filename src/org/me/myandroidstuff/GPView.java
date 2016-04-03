package org.me.myandroidstuff;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.view.View;

public class GPView extends View
{
	private Canvas canvas;
    private Bitmap bitmap;
 
    public GPView(Context context) 
    {
        super(context);
    }    
 
    protected void onSizeChanged(int curw, int curh, int oldw, int oldh) {
        if (bitmap != null) 
        {
            bitmap .recycle();
        }
        canvas= new Canvas();
        bitmap = Bitmap.createBitmap(curw, curh, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(bitmap);
    }
    public void destroy() 
    {
        if (bitmap != null) 
        {
            bitmap.recycle();
        }
    }
    public void onDraw(Canvas canvas) 
    {
      //draw onto the canvas
        Paint myPaint = new Paint();
        myPaint.setStrokeWidth(3);
        myPaint.setColor(0xFF097286);
        canvas.drawCircle(190, 40, 30, myPaint);
        myPaint.setColor(0xFFF07222);
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = 0;
        p1.y = 0;
        p2.x = 40;
        p2.y = 55;
        canvas.drawLine(p1.x, p1.y, p2.x, p2.y, myPaint);
        float[] pts = new float[8];
        pts[0] = 100;
        pts[1] = 5;
        pts[2] = 97;
        pts[3] = 9;
        pts[4] = 90;
        pts[5] = 15;
        pts[6] = 84;
        pts[7] = 20;
        myPaint.setColor(0xFF40FF40);
        myPaint.setStrokeWidth(9);
        myPaint.setAntiAlias(true);
        canvas.drawPoints(pts, myPaint);
 
        myPaint.setColor(0xFFF0FF00);
        myPaint.setStrokeWidth(4);
        myPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(110, 150, 100, myPaint);
        
        myPaint.setColor(Color.RED);
        myPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(150, 300, 100, 500, myPaint);
        
        RectF arect = new RectF(300,300,400,600);
        canvas.drawRoundRect(arect, 20, 20, myPaint);
    }

}
