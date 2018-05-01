package com.qiaoshouliang.demo.EventMechanism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.qiaoshouliang.demo.R;

/**
 * 图解 Android 事件分发机制
 * https://juejin.im/entry/58ff206eda2f60005dd5e944
 */
public class EventActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {
    private MyTextView mMyTextView;
    private String tag = "EventActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        mMyTextView = findViewById(R.id.text_view);
        //  点击监听
        mMyTextView.setOnClickListener(this);
        //  触碰监听
//        mMyTextView.setOnTouchListener(this);
    }


    // MyTextView 点击事件
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.text_view:
                Log.i(tag, "MyTextView onClick");
                break;
        }
    }

    // MyTextView 触碰事件
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
//            case MotionEvent.ACTION_UP:
//                Log.i(tag, "MyTextView onTouch ACTION_UP");
//                break;
//            case MotionEvent.ACTION_MOVE:
//                Log.i(tag, "MyTextView onTouch ACTION_MOVE");
//                break;
            case MotionEvent.ACTION_DOWN:
                Log.i(tag, "MyTextView onTouch ACTION_DOWN");
                break;
        }
        return false;
    }

    // Activity&emsp;的事件分发
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
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
        return super.dispatchTouchEvent(ev);
    }

    // Activity 的事件消费
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
        return super.onTouchEvent(event);
    }
}

