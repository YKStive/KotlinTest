package com.youloft.kotlintest.widget

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.youloft.kotlintest.R


/**
 * @author you
 * @create 2020/4/16
 * @desc
 */
class CircleView : ConstraintLayout {
    private var mCircleCount: Int = 0
    private var mCircleWith: Int = 0
    private var mWith: Int = 0
    private var mCircleLeft: Float = 20f
    private var mTop: Float = 15f
    private var mCircle: Bitmap
    private var mPaint: Paint


    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )


    init {
        mPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        mPaint.style = Paint.Style.FILL
        mCircle = BitmapFactory.decodeResource(context.resources, R.drawable.ic_circle)
        mCircleWith = mCircle.width



    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        mWith = measuredWidth

        mCircleCount = mWith / mCircleWith

    }

    override fun dispatchDraw(canvas: Canvas) {
        super.dispatchDraw(canvas);
        mPaint.xfermode = PorterDuffXfermode(PorterDuff.Mode.MULTIPLY)
        for (index in 1..mCircleCount) {
            canvas.drawBitmap(mCircle, mCircleLeft, mTop, mPaint)
            mCircleLeft += mCircleWith
        }
    }

}