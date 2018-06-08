package com.qiaoshouliang.demo.activity

import android.drm.DrmStore.DrmObjectType.CONTENT
import android.graphics.BlurMaskFilter
import android.graphics.Color
import android.graphics.EmbossMaskFilter
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.*
import com.qiaoshouliang.demo.R
import kotlinx.android.synthetic.main.activity_span.*
import android.text.style.BackgroundColorSpan
import android.graphics.Typeface
import android.text.style.StyleSpan
import android.text.style.TypefaceSpan
import android.text.style.RelativeSizeSpan
import android.text.style.ScaleXSpan


/**
 * Created by qiaoshouliang on 2018/5/29. (ง •̀_•́)ง
 */
class SpanActivity : AppCompatActivity() {

    val TAG = "StatedActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_span)
        val CONTENT = "Android Span 架构介绍"

        val foregroundColorSpan = ForegroundColorSpan(Color.RED)
        val spannableString = SpannableString(CONTENT)

        spannableString.setSpan(foregroundColorSpan, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_span1.text = spannableString

        /**
         * Spanned.SPAN_INCLUSIVE_EXCLUSIVE 在insert的时候有效果，其他的时候都没效果
         */
        val spannableStringBuilder = SpannableStringBuilder(CONTENT)
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, 2, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        spannableStringBuilder.insert(0, "测试")
        tv_span2.text = spannableStringBuilder


        val bulletSpan = BulletSpan(15, Color.RED)
        val spannableString3 = SpannableString(CONTENT)
        spannableString3.setSpan(bulletSpan, 0, 1, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        tv_span3.text = spannableString3

        val quoteSpan = QuoteSpan(Color.RED)
        val spannableString4 = SpannableString(CONTENT)
        spannableString4.setSpan(quoteSpan, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_span4.text = spannableString4

        val subscriptSpan = SubscriptSpan()
        val spannableString5 = SpannableString(CONTENT)
        spannableString5.setSpan(subscriptSpan, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_span5.text = spannableString5

        val superscriptSpan = SuperscriptSpan()
        val spannableString6 = SpannableString(CONTENT)
        spannableString6.setSpan(superscriptSpan, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_span6.text = spannableString6

        val backgroundColorSpan = BackgroundColorSpan(Color.RED)
        val spannableString7 = SpannableString(CONTENT)
        spannableString7.setSpan(backgroundColorSpan, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_span7.text = spannableString7

        val imageSpan = ImageSpan(this, R.mipmap.ic_launcher)
        val spannableString8 = SpannableString(CONTENT)
        spannableString8.setSpan(imageSpan, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_span8.text = spannableString8

        val styleSpan = StyleSpan(Typeface.BOLD)
        val spannableString9 = SpannableString(CONTENT)
        spannableString9.setSpan(styleSpan, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_span9.text = spannableString9


        val typefaceSpan = TypefaceSpan("serif")
        val spannableString10 = SpannableString(CONTENT)
        spannableString10.setSpan(typefaceSpan, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_span10.text = spannableString10

        val absoluteSizeSpan = AbsoluteSizeSpan(24, true)
        val spannableString11 = SpannableString(CONTENT)
        spannableString11.setSpan(absoluteSizeSpan, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_span11.text = spannableString11


        val relativeSizeSpan = RelativeSizeSpan(2.0f)
        val spannableString12 = SpannableString(CONTENT)
        spannableString12.setSpan(relativeSizeSpan, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_span12.text = spannableString12

        val scaleXSpan = ScaleXSpan(2.0f)
        val spannableString13 = SpannableString(CONTENT)
        spannableString13.setSpan(scaleXSpan, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_span13.text = spannableString13


        val blurMask = MaskFilterSpan(BlurMaskFilter(20f, BlurMaskFilter.Blur.NORMAL))
        val spannableString14 = SpannableString(CONTENT)
        spannableString14.setSpan(blurMask, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_span14.text = spannableString14

        val embossMask = MaskFilterSpan(EmbossMaskFilter(arrayOf(1f, 1f, 1f).toFloatArray(), 0.4f, 6f, 3.5f))
        val spannableString15 = SpannableString(CONTENT)
        spannableString15.setSpan(embossMask, 0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_span15.text = spannableString15

    }

}