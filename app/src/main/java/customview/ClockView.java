package customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.Calendar;

/**
 * Created by wty on 16/10/11.
 */

public class ClockView extends SurfaceView implements SurfaceHolder.Callback, Runnable {

    private static final int DEFAULT_RADIUS = 200;


    private int mClockRadius = DEFAULT_RADIUS;
    private int mHourDegreeLength;
    private int mSecondDegreeLength;
    private int mHourPointerLength;
    private int mMinutePointerLength;
    private int mSecondPointerLength;

    private int mTimeTextStartAngle = 270;
    private int mTimeTextintervalAngle = 30;
    private int mSecondStartAngle = 270;
    private float mMinuteStartAngle = 270;
    private float mHourStartAngle = 270;
    private int secondIncreaseAngle = 6;
    private int minuteIncreaseAngle = 6;
    private int hourIncreaseAngle = 30;
    private int secondDelta = 0;
    private int minuteDelta = 0;

    private Paint paint;
    private Paint pointerPaint;
    private Paint textPaint;

    private boolean drawFlag = false;
    private SurfaceHolder surfaceHolder = null;
    private Canvas mCanvas = null;

    public ClockView(Context context) {
        this(context, null);
    }

    public ClockView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    private void init() {
        paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);

        pointerPaint = new Paint();
        pointerPaint.setColor(Color.BLACK);
        pointerPaint.setAntiAlias(true);

        textPaint = new Paint();
        textPaint.setColor(Color.BLACK);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(30);

        surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heigthSize = MeasureSpec.getSize(heightMeasureSpec);
        int heigthMode = MeasureSpec.getMode(heightMeasureSpec);

        int desireWidth, desireHeigth;
        if (MeasureSpec.EXACTLY == widthMode) {
            desireWidth = widthSize;
        } else {
            desireWidth = mClockRadius * 2 + getPaddingRight() + getPaddingLeft();////MeasureSpec.UNSPECIFIED
            if (MeasureSpec.AT_MOST == widthMode) {
                desireWidth = Math.min(widthSize, desireWidth);
            }
        }

        if (MeasureSpec.EXACTLY == heigthMode) {
            desireHeigth = heigthSize;
        } else {
            desireHeigth = mClockRadius * 2 + getPaddingBottom() + getPaddingTop();
            if (MeasureSpec.AT_MOST == heigthMode) {
                desireHeigth = Math.min(desireHeigth, heigthSize);
            }
        }

        setMeasuredDimension(desireWidth + 4, desireHeigth + 4);

        mClockRadius = Math.min(desireWidth - getPaddingLeft() - getPaddingRight(), desireHeigth - getPaddingTop() - getPaddingBottom()) / 2;
        calculateLengths();
    }

    private void calculateLengths() {
        mHourDegreeLength = mClockRadius / 7;
        mSecondDegreeLength = mHourDegreeLength / 2;

        mHourPointerLength = mClockRadius / 2;
        mMinutePointerLength = (int) (mHourPointerLength * 1.4f);
        mSecondPointerLength = (int) (mHourPointerLength * 1.65f);

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        drawFlag = true;
        Thread task = new Thread(this);
        task.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        drawFlag = false;
    }

    @Override
    public void run() {
        initTime();
        while (drawFlag) {
            doDraw();
        }
    }

    private void doDraw() {
        try {
            mCanvas = surfaceHolder.lockCanvas();
            if (null != mCanvas) {
                drawContent(mCanvas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != mCanvas) {
                surfaceHolder.unlockCanvasAndPost(mCanvas);
            }
        }

    }

    private long startTime = 0;

    private void drawContent(Canvas canvas) {
        canvas.drawColor(Color.WHITE);
        canvas.translate((canvas.getWidth() * 1f / 2 + getPaddingLeft() - getPaddingRight()), mCanvas.getHeight() * 1f / 2 + getPaddingTop() - getPaddingBottom());
        paint.setStrokeWidth(2f);
        canvas.drawCircle(0, 0, mClockRadius, paint);

        int hourRotateTimes = 12;
        int hourRotateDegree = 30;
        for (int i = 0; i < hourRotateTimes; i++) {////小时刻度
            canvas.drawLine(0f, mClockRadius * 1f, 0f, mClockRadius * 1f - mHourDegreeLength * 1f, paint);
            canvas.rotate(hourRotateDegree);
        }

        int secondRotateTimes = 60;
        int secondRotateDegree = 6;
        for (int i = 0; i < secondRotateTimes; i++) {///分钟秒 刻度
            canvas.drawLine(0f, mClockRadius * 1f, 0f, mClockRadius * 1f - mSecondDegreeLength, paint);
            canvas.rotate(secondRotateDegree);
        }

        for (int i = 1; i <= 12; i++) {///小时示数
            float x = (float) (Math.cos(Math.toRadians(mTimeTextStartAngle + i * mTimeTextintervalAngle)) * (mClockRadius - mHourDegreeLength * 1.4));
            float y = (float) (Math.sin(Math.toRadians(mTimeTextStartAngle + i * mTimeTextintervalAngle)) * (mClockRadius - mHourDegreeLength * 1.4));
            canvas.drawText(i + "", x, y, textPaint);
        }

        long currentTime = System.currentTimeMillis();


        if (currentTime - startTime < 1000) {
            try {
                Thread.sleep(1000 - (currentTime - startTime));
                secondDelta = secondDelta + secondIncreaseAngle;
                mSecondStartAngle = mSecondStartAngle + secondIncreaseAngle;

                float[] secondPoint = generatePoint(mSecondStartAngle, mSecondPointerLength);
                canvas.drawLine(0, 0, secondPoint[0], secondPoint[1], pointerPaint);

                mMinuteStartAngle = mMinuteStartAngle + (minuteIncreaseAngle * 1f / 60f);/////
                float[] minutePoint = generatePoint(mMinuteStartAngle, mMinutePointerLength);
                canvas.drawLine(0, 0, minutePoint[0], minutePoint[1], pointerPaint);

                mHourStartAngle = mHourStartAngle + (hourIncreaseAngle * 1f / 3600f);
                float[] hourPoint = generatePoint(mHourStartAngle, mHourPointerLength);
                canvas.drawLine(0, 0, hourPoint[0], hourPoint[1], pointerPaint);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        startTime = System.currentTimeMillis();
    }

    /**
     * 计算坐标
     * @param angle
     * @param radius
     * @return
     */
    private float[] generatePoint(float angle, int radius) {
        float[] point = new float[2];
        float x = (float) (Math.cos(Math.toRadians(angle)) * (radius));
        float y = (float) (Math.sin(Math.toRadians(angle)) * (radius));
        point[0] = x;
        point[1] = y;
        return point;
    }


    /**
     * 初始化系统时间
     */
    private void initTime() {
        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR_OF_DAY) - 12;
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        mHourStartAngle = mHourStartAngle + hour * 30;
        mMinuteStartAngle = mMinuteStartAngle + minute * 6;
        mSecondStartAngle = mSecondStartAngle + second * 6;

    }
}
