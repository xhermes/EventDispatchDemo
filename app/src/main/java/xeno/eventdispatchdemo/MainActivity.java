package xeno.eventdispatchdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("xeno", "Activity dispatchTouchEvent" + LogUtils.action(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("xeno", "Activity onTouchEvent" + LogUtils.action(event.getAction()));
        return super.onTouchEvent(event);
    }
}
