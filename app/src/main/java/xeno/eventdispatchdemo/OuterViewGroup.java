package xeno.eventdispatchdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by xeno on 2017/11/23.
 */

public class OuterViewGroup extends LinearLayout {
    public OuterViewGroup(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public OuterViewGroup(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("xeno", "Outer dispatchTouchEvent" + LogUtils.action(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("xeno", "Outer onInterceptTouchEvent" + LogUtils.action(ev.getAction()));
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("xeno", "Outer onTouchEvent" + LogUtils.action(event.getAction()));
        return super.onTouchEvent(event);
    }
}
