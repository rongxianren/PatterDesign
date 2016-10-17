package com.rongxianren.patterdesign;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class CustomClockViewActivity extends AppCompatActivity implements SurfaceHolder.Callback {


    private SurfaceView mySurfaceView = null;
    SurfaceHolder surfaceHolder = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_clock_view);

//        mySurfaceView = (SurfaceView) findViewById(R.id.my_surfaceview);
//        surfaceHolder = mySurfaceView.getHolder();
//        surfaceHolder.addCallback(this);
    }


    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        Canvas canvas = holder.lockCanvas();
        canvas.drawColor(Color.WHITE);
        canvas.translate(mySurfaceView.getWidth() / 2, mySurfaceView.getHeight() / 2);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2f);
        canvas.drawCircle(0, 0, mySurfaceView.getWidth() / 2, paint);
        holder.unlockCanvasAndPost(canvas);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

}
