package com.example.test3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0
        var imageNum = arrayOf(R.drawable.image1,
            R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5)

        var button = findViewById<Button>(R.id.jButton)
        var textView = findViewById<TextView>(R.id.jText)
        var imageView = findViewById<ImageView>(R.id.im2)

        button.setOnClickListener {
            count += 1
            if (count > 4) {
                count = 0
            }
            //Log.d("><Button clicked", "clickclick" + count)
                textView.text = count.toString()
                imageView.setImageResource(imageNum[count])


        }
    }
}