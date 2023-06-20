package com.example.fragmentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"On create",Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"On Start",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"On Resume",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"On Pause",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"On Stop",Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"On Restart",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"On Destroy",Toast.LENGTH_SHORT).show()
    }
    }
