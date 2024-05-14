package com.example.projectone

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projectone.MainActivity.Constant.myName
import com.example.projectone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // For Get ID
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        callBack()
        callView()

        Log.d(MainActivity.LOG_TAG, "On Create")

    }

    override fun onStart() {
        super.onStart()
        Log.d(MainActivity.LOG_TAG, "On Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MainActivity.LOG_TAG, "On Resume")

    }

    override fun onPause() {
        super.onPause()
        Log.d(MainActivity.LOG_TAG, "On Pause")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MainActivity.LOG_TAG, "On Restart")

    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity.LOG_TAG, "On Stop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity.LOG_TAG, "On Destroy")

    }

    companion object {
        const val LOG_TAG = "FIRST_ACTIVITYYYY"
    }

    // Go Next Activity
    private fun callBack() {
        binding.nextB.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val name = binding.passData.text.toString()
            intent.putExtra(myName, name)
            startActivity(intent)
        }
    }

    private fun callView() {

        // Go Link

        binding.nextV.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/3mohamed-abdelfattah")
            startActivity(intent)
        }

        // Make Call
        binding.nextC.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            val phoneNum = binding.getNum.text.toString()
            intent.data = Uri.parse("tel:$phoneNum")
            startActivity(intent)
        }
    }


    // Send Data
    object Constant {
        val myName = "Mohamed Mohamed"
    }

}