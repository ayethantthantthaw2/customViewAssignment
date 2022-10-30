package com.attt.customviewsassignment.Views.components

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View
import androidx.core.content.withStyledAttributes
import com.attt.customviewsassignment.R

class CircularProgressBar(context: Context?, attrs: AttributeSet?) :View(context, attrs){
    var size = 0
    var paint = Paint()
    var oval = RectF()
    var borderWidth = 10f
    var progress = 0

    var textColor: Int=0
    var progressBarColor=0
    var progressColor=0
    init {
        context?.withStyledAttributes(attrs, R.styleable.CircularProgressBar){
            progress=getInt(R.styleable.CircularProgressBar_progress,0)
            borderWidth=getDimension(R.styleable.CircularProgressBar_progressBarRadius,borderWidth)
            textColor=getColor(R.styleable.CircleImageView_stokeColor,0)
            progressBarColor=getColor(R.styleable.CircularProgressBar_progressBackgroundColor,0)
            progressColor=getColor(R.styleable.CircularProgressBar_progressColor,0)

        }
    }
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        var progressLeft=100f-progress
        paint.color=progressColor
        paint.style = Paint.Style.STROKE
        paint.textSize = size * 0.32f
        paint.strokeWidth = borderWidth
        paint.strokeCap= Paint.Cap.BUTT
        oval.set(
            borderWidth / 2,
            borderWidth / 2,
            size - borderWidth / 2f,
            size - borderWidth / 2
        )
        canvas?.drawArc(oval, -90f, progress * 3.6f, false, paint)

        paint.color=progressBarColor
        canvas?.drawArc(oval, -90f, -(progressLeft*3.6f), false, paint)
        paint.style = Paint.Style.FILL
        paint.color=progressColor
        canvas?.drawText("$progress%", size * 0.23f, size * 0.64f, paint)
    }

}