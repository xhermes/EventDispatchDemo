package xeno.eventdispatchdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by xeno on 2017/11/23.
 */

public class TestView extends View {

    public TestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

//    public TestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i("xeno", "View dispatchTouchEvent" + LogUtils.action(event.getAction()));
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("xeno", "View onTouchEvent" + LogUtils.action(event.getAction()));
        return super.onTouchEvent(event);
    }
}
