package com.youloft.kotlintest.widget

import android.content.Context
import android.graphics.*
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.youloft.kotlintest.R


/**
 * @author you
 * @create 2020/4/16
 * @desc
 */
class CircleView : ConstraintLayout {
    private var drawable: Drawable?
    private var mHeight: Int = 0
    private var mCircleCount: Int = 0
    private var mCircleWith: Int = 0
    private var mWith: Int = 0
    private var mCircleLeft: Float = 0f
    private var mTop: Float = 0f
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

         drawable = resources.getDrawable(R.drawable.ic_circle, null)

        setLayerType(View.LAYER_TYPE_SOFTWARE, null);


    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        mWith = measuredWidth
        mHeight = measuredHeight


        mCircleCount = mWith / mCircleWith

    }

    override fun dispatchDraw(canvas: Canvas) {
//        val saveLayerCount = canvas.saveLayer(0f, 0f, mWith.toFloat(), mHeight.toFloat(), mPaint)
        super.dispatchDraw(canvas);



//        drawable?.draw(canvas)

        mPaint.xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_IN)
        for (index in 1..mCircleCount) {
            canvas.drawBitmap(mCircle, mCircleLeft, mTop, mPaint)
            mCircleLeft += mCircleWith
        }
//        mPaint.xfermode = null
//        canvas.restoreToCount(saveLayerCount)
    }

}