package com.qiaoshouliang.demo.Lifecycle;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.qiaoshouliang.demo.R;

/**
 * 自定义控件生命周期自我管理，lifecycle让它如此简单
 * https://juejin.im/entry/5a06ce1e6fb9a044fa195576/detail
 */
public class LifecycleActivity extends AppCompatActivity {

    private static final String TAG = "LifecycleActivity";
    private HandlerThread myHandlerThread;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.d(TAG, "onCreate: ");
        getLifecycle().addObserver(new MyLifecycleObserver());
        //创建一个线程,线程名字：handler-thread
        myHandlerThread = new HandlerThread("handler-thread");
        //开启一个线程
        myHandlerThread.start();
        //在这个线程中创建一个handler对象
        handler = new Handler(myHandlerThread.getLooper()) {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                //这个方法是运行在 handler-thread 线程中的 ，可以执行耗时操作
                Log.d("handler ", "消息： " + msg.what + "  线程： " + Thread.currentThread().getName());

            }
        };
        //在主线程给handler发送消息
        handler.sendEmptyMessage(1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                //在子线程给handler发送数据
                handler.sendEmptyMessage(2);
            }
        }).start();

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
