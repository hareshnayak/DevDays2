package com.hareshnayak.lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hareshnayak.lemonade.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
   private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getStringExtra("name")
        binding.textView2.text = data
    }
}