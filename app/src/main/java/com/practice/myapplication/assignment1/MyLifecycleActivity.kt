package com.practice.myapplication.assignment1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MyLifecycleActivity : AppCompatActivity() {

    private val TAG = "Lifecycle Method"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ${TAG}")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: $TAG")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: $TAG")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: $TAG")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: $TAG")
    }
}