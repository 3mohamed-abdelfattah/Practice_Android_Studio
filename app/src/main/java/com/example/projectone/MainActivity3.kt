package com.example.projectone

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.replace
import com.example.projectone.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    val myFirstFramgment = fragment_One()
    val mySecoundFramgment = fragment_two()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        initButton()
        initView()

    }

    //To Get Button And Go Second Fragment
    private fun initButton() {
        findViewById<Button>(R.id.back_frag).setOnClickListener {
            showSecoundFragment()
        }
        findViewById<Button>(R.id.remove_frag).setOnClickListener {
            removeFragment(mySecoundFramgment)
        }
    }

    //Show Fragments
    private fun initView() {
        addFragment(myFirstFramgment)
    }

    private fun showSecoundFragment() {
        replaceFragment(mySecoundFramgment)
    }

    //Add Fragment
    private fun addFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.FragmentView, fragment).commit()
    }

    //Replace Fragment
    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.FragmentView, fragment).commit()
    }

    //Remove Fragment
    private fun removeFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.remove(fragment).commit()
    }

}