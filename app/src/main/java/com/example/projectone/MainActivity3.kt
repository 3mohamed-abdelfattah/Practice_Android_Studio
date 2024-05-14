package com.example.projectone

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projectone.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    val myFirstFramgment = fragment_One()
    val mySecoundFramgment = fragment_two()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        initView()
        initButton()
    }

    //Show one Fragment
    private fun initView() {
        val transection = supportFragmentManager.beginTransaction()
        transection.add(R.id.FragmentView, myFirstFramgment)
        transection.commit()
    }

    //To Get Button And Go Second Fragment
    private fun initButton() {
        findViewById<Button>(R.id.back_frag).setOnClickListener {
            showSecoundFragment()
        }
    }

    private fun showSecoundFragment() {
        val transetion = supportFragmentManager.beginTransaction()
        transetion.replace(R.id.FragmentView, mySecoundFramgment)
        transetion.commit()
    }

}