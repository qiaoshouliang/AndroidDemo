package com.qiaoshouliang.demo

import android.app.Application
import pers.victor.ext.Ext

/**
 * @describe describe
 * @anthor qiaoshouliang😜
 * @time 2018/5/1 下午6:16
 * @chang time
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Ext.with(this)
    }
}