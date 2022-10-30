package com.attt.customviewsassignment.Views.components

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.withStyledAttributes
import com.attt.customviewsassignment.R


class CircleImageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr) {

    private var cornerRadius = 0f
    private val path = Path()

    private var size = 0
    private var stokeColor = Color.WHITE
    private val paint = Paint()
    var stokeSize = 10f


    init {

        context.withStyledAttributes(attrs, R.styleable.CircleImageView) {
            cornerRadius = getDimension(R.styleable.CircleImageView_cornerRadius, 0f)
            stokeColor = getColor(R.styleable.CircleImageView_stokeColor, stokeColor)
        }
    }

    override fun onDraw(canvas: Canvas?) {

        val rectangle = RectF(0f, 0f, width.toFloat(), height.toFloat())

        path.addRoundRect(rectangle, cornerRadius, cornerRadius, Path.Direction.CCW)

        canvas?.clipPath(path)

        super.onDraw(canvas)
        canvas?.drawCircle(size / 2f, size / 2f, size / 2f - (stokeSize / 2f), paint)

    }

}