package com.qiaoshouliang.demo.workmanager

import androidx.work.Worker

/**
 * Created by qiaoshouliang on 2018/5/25. (ง •̀_•́)ง
 */


class MyWorker : Worker() {
    override fun doWork(): WorkerResult {
        println("doWork")
        return WorkerResult.SUCCESS
    }
}