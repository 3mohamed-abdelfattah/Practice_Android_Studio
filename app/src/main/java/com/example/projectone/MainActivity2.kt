package com.example.projectone

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projectone.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)


        val name = intent.getStringExtra(MainActivity.Constant.myName)
        binding.textView2.text = name

        backStep()
        goFragment()

        Log.d(MainActivity2.LOG_TAG, "On Create")

    }


    override fun onStart() {
        super.onStart()
        Log.d(MainActivity2.LOG_TAG, "On Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MainActivity2.LOG_TAG, "On Resume")

    }

    override fun onPause() {
        super.onPause()
        Log.d(MainActivity2.LOG_TAG, "On Pause")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MainActivity2.LOG_TAG, "On Restart")

    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity2.LOG_TAG, "On Stop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity2.LOG_TAG, "On Destroy")

    }

    companion object {
        const val LOG_TAG = "Secount_ACTIVITYYYY"
    }

    // Go Previous Activity
    private fun backStep() {
        binding.backB.setOnClickListener {
            finish()
        }
    }

    private fun goFragment() {
        binding.goF.setOnClickListener {
            val intent2 = Intent(this, MainActivity3::class.java)
            startActivity(intent2)
        }
    }
}