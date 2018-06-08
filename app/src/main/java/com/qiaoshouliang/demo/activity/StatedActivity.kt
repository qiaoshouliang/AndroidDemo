package com.qiaoshouliang.demo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * Created by qiaoshouliang on 2018/5/29. (ง •̀_•́)ง
 */
class StatedActivity : AppCompatActivity() {

    val TAG = "StatedActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG, "onCreate = ${savedInstanceState}")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.e(TAG, "onSaveInstanceState = ${outState}")
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.e(TAG, "onRestoreInstanceState = ${savedInstanceState}")
        super.onRestoreInstanceState(savedInstanceState)
    }
}