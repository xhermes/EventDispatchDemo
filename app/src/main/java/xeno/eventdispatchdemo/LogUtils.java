package xeno.eventdispatchdemo;

import android.view.MotionEvent;

/**
 * Created by xeno on 2017/11/23.
 */

public class LogUtils {

    public static String action(int actionInt) {
        switch (actionInt) {
            case MotionEvent.ACTION_DOWN :
                return "DOWN";
            case MotionEvent.ACTION_UP:
                return "UP";
            case MotionEvent.ACTION_MOVE:
                return "MOVE";
            default:
                return "";
        }
    }
}
