package com.qiaoshouliang.demo.EventMechanism;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * @describe describe
 * @anthor qiaoshouliang😜
 * @time 2018/5/1 下午6:20
 * @chang time
 */
public class MyTextView extends AppCompatTextView {

    private String tag = "MyTextView";

    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
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
//        return super.dispatchTouchEvent(event);
        return false;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
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
        Boolean result = super.onTouchEvent(event);
        Log.d(tag, "onTouchEvent: "+result);
        return result;
    }

}
