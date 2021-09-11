package com.hareshnayak.lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hareshnayak.lemonade.databinding.ActivityMainBinding

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.button.setOnClickListener{
//            val intent = Intent(this, MainActivity2::class.java)
//            intent.putExtra("name","Developer Days")
//            startActivity(intent)
//        }
    }
    //Start broadcast
    override fun onStart(){
        super.onStart()
        Log.d(TAG, "onStart")
    }
    // App is partially hidden - pop up or notification is up
    override fun onPause(){
        super.onPause()
        Log.d(TAG, "onPause")
    }
    // User can start interacting with the app
    override fun onResume(){
        super.onResume()
        Log.d(TAG, "onResume")
    }
    // App is in background
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }
    // App is destroyed
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Called")
    }




}