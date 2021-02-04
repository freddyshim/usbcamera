package com.anookday.usbcamera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.SurfaceView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preview = findViewById<SurfaceView>(R.id.cameraPreview)
        val onButton = findViewById<Button>(R.id.buttonOn)
        val offButton = findViewById<Button>(R.id.buttonOff)

        onButton.setOnClickListener { _ ->
            onButton.text = connect()
        }
    }

    external fun connect(): String

    companion object {
        init {
            System.loadLibrary("usbcamera")
        }
    }
}