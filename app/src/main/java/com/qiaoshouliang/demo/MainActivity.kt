package com.qiaoshouliang.demo

import android.arch.lifecycle.LifecycleRegistry
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.qiaoshouliang.demo.EventMechanism.EventActivity
import com.qiaoshouliang.demo.Lifecycle.LifecycleActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val source = arrayOf(LifecycleActivity::class.java, EventActivity::class.java)

        val adapter = DemoAdapter(source)
        adapter.setClickListener {
            val intent = Intent(this, source[it])
            startActivity(intent)
        }
        rv_function.adapter = adapter
        rv_function.layoutManager = GridLayoutManager(this, 5)
    }
}
