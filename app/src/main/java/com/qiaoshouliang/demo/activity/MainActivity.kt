package com.qiaoshouliang.demo.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.qiaoshouliang.demo.DemoAdapter
import com.qiaoshouliang.demo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val source = arrayOf(LifecycleActivity::class.java,
                WorkManagerActivity::class.java)

        val adapter = DemoAdapter(source)
        adapter.setClickListener {
            val intent = Intent(this, source[it])
            startActivity(intent)
        }
        rv_function.adapter = adapter
    }
}
