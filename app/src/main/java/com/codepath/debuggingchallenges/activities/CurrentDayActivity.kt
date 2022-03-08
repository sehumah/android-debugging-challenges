package com.codepath.debuggingchallenges.activities

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.os.Bundle
import android.util.Log
import android.view.View
import com.codepath.debuggingchallenges.R
import org.w3c.dom.Text
import java.util.*


private const val TAG = "CurrentDayActivity"
class CurrentDayActivity : AppCompatActivity() {
    var tvDay: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_day)
        tvDay = findViewById<View>(R.id.tvDay) as TextView
//        tvDay?.setText(dayOfMonth)  // original line
        tvDay?.text = dayOfMonth.toString()
        Log.i(TAG, "info : in CurrentDayActivity.kt")
        Log.e(TAG, "error: in CurrentDayActivity.kt")
    }

    private val dayOfMonth: String
        get() {
            val cal = Calendar.getInstance()
            // return cal[Calendar.DAY_OF_MONTH]
            /* below is my solution */
            val month = cal[Calendar.MONTH]
            val day = cal[Calendar.DAY_OF_MONTH]
            val year = cal[Calendar.YEAR]
            return "$month/$day/$year"
        }
}
