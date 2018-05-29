package com.qiaoshouliang.demo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.qiaoshouliang.demo.lifecycle.MyLifecycleObserver;
import com.qiaoshouliang.demo.R;

/**
 * 自定义控件生命周期自我管理，lifecycle让它如此简单
 * https://juejin.im/entry/5a06ce1e6fb9a044fa195576/detail
 */
public class LifecycleActivity extends AppCompatActivity {

    private static final String TAG = "LifecycleActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.d(TAG, "onCreate: ");
        getLifecycle().addObserver(new MyLifecycleObserver());
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
