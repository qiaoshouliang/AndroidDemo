package com.qiaoshouliang.demo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.work.PeriodicWorkRequest
import androidx.work.WorkManager
import com.qiaoshouliang.demo.R
import com.qiaoshouliang.demo.workmanager.MyWorker
import kotlinx.android.synthetic.main.activity_work_manager.*
import pers.victor.ext.click
import java.util.concurrent.TimeUnit

class WorkManagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work_manager)

        btn_start_work.click {

            val workerRequest = PeriodicWorkRequest.Builder(MyWorker::class.java, 30, TimeUnit.SECONDS).build()
            WorkManager.getInstance().enqueue(workerRequest)
        }
    }
}
