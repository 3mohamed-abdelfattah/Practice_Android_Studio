package com.example.projectone

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projectone.databinding.ActivityMainBinding
import com.example.projectone.databinding.ActivityMainSpinnerBinding

class MainActivitySpinner : AppCompatActivity() {

    lateinit var binding: ActivityMainSpinnerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainSpinnerBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initSpinner()
    }

    //Spinner [Drop Down List]
    private fun initSpinner() {
        val item = listOf("A", "B", "C", "D")
        val myAdapter = ArrayAdapter(this, R.layout.activity_main_spinner, item)
        binding.spinner.apply {
            adapter = myAdapter
            onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    Toast.makeText(this@MainActivitySpinner, item[p2], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                }

            }
        }
    }
}