package com.codepath.debuggingchallenges.activities

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.codepath.debuggingchallenges.R


private const val TAG = "ChangeBackgroundActivity"
class ChangeBackgroundActivity : AppCompatActivity() {
    private var oldColor = Color.BLUE
    @SuppressLint("LongLogTag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_background)
        // get reference to layout view
        val view = findViewById<View>(R.id.content)
        // get reference to button and set click listener to button
        val btnGo = findViewById<Button>(R.id.btnGo)
        btnGo.setOnClickListener {
            onGoClick(view)
            // Toast.makeText(this, "GO button clicked!", Toast.LENGTH_LONG).show()
        }
        Log.i(TAG, "in $TAG")
    }

    fun onGoClick(view: View?) { // originally had "view: View?" as parameter
        val mainView = findViewById<View>(android.R.id.content)
        mainView.setBackgroundColor(nextColor)
    }

    private val nextColor: Int
        private get() {
            val newColor = if (oldColor == Color.BLUE) Color.RED else Color.BLUE
            oldColor = newColor
            return newColor
        }
}

