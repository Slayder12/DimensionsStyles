package com.example.dimensionsstyles

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.util.TypedValue
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.setMargins


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* for example
        val resources = resources
        val textSize = resources.getDimension (R.dimen.textSizeNormal)
        val verticalMargin = resources.getDimension (R.dimen.verticalMarginNormal)
        val constraintLayout = ConstraintLayout(this)
        val layoutParams = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT

        )
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID
        val textView = TextView(this)
        textView.text = "Привет мир!"
        textView.setBackgroundColor(Color.CYAN)
        textView.setTextSize (TypedValue.COMPLEX_UNIT_PX, textSize)
        layoutParams.setMargins(verticalMargin.toInt())
        textView.layoutParams = layoutParams
        constraintLayout.addView(textView)
        setContentView(constraintLayout)
        */
    }
}