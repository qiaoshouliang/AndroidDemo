package com.qiaoshouliang.demo.EventMechanism;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * @describe describe
 * @anthor qiaoshouliang😜
 * @time 2018/5/1 下午7:18
 * @chang time
 */
public class MyRelativeLayout extends RelativeLayout {

    private final static String tag = "MyRelativeLayout";

    public MyRelativeLayout(Context context) {
        super(context);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
//            case MotionEvent.ACTION_UP:
//                Log.i(tag, "dispatchTouchEvent ACTION_UP");
//                break;
//            case MotionEvent.ACTION_MOVE:
//                Log.i(tag, "dispatchTouchEvent ACTION_MOVE");
//                break;
            case MotionEvent.ACTION_DOWN:
                Log.i(tag, "dispatchTouchEvent ACTION_DOWN");
                break;
        }
//        return false;
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
//            case MotionEvent.ACTION_UP:
//                Log.i(tag, "onInterceptTouchEvent ACTION_UP");
//                break;
//            case MotionEvent.ACTION_MOVE:
//                Log.i(tag, "onInterceptTouchEvent ACTION_MOVE");
//                break;
            case MotionEvent.ACTION_DOWN:
                Log.i(tag, "onInterceptTouchEvent ACTION_DOWN");
                break;
        }
//        return false;
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
//            case MotionEvent.ACTION_UP:
//                Log.i(tag, "onTouchEvent ACTION_UP");
//                break;
//            case MotionEvent.ACTION_MOVE:
//                Log.i(tag, "onTouchEvent ACTION_MOVE");
//                break;
            case MotionEvent.ACTION_DOWN:
                Log.i(tag, "onTouchEvent ACTION_DOWN");
                break;
        }
        return super.onTouchEvent(event);
    }
}

