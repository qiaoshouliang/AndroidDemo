package com.qiaoshouliang.demo

import android.app.Activity
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_function.*
import pers.victor.ext.click
import pers.victor.ext.inflate

/**
 * @describe describe
 * @anthor qiaoshouliang😜
 * @time 2018/4/30 下午9:23
 * @chang time
 */
class DemoAdapter(val data: Array<Class<out AppCompatActivity>>) : RecyclerView.Adapter<DemoAdapter.Holder>() {
    var callback: ((Int) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = Holder(inflate(R.layout.item_function, parent))

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.tv_function_name.text = data[position].simpleName.replace("Activity", "")
        holder.containerView?.click { callback?.invoke(position) }
    }

    class Holder(override val containerView: View?) : RecyclerView.ViewHolder(containerView), LayoutContainer

    fun setClickListener(callback: ((Int) -> Unit)) {
        this.callback = callback
    }

}

