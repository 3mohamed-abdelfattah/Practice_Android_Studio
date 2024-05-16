package com.example.projectone

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projectone.databinding.ActivityMainFloatingActionButtonBinding

class MainActivityFloatingActionButton : AppCompatActivity() {
    lateinit var binding: ActivityMainFloatingActionButtonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainFloatingActionButtonBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.floatingActionButton.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
        }

        binding.alert.setOnClickListener {
            showAlert()
        }
    }

    private fun showAlert() {
        val builder = AlertDialog.Builder(this)
        builder.apply {
            setTitle("Location Permission")
            setMessage("Accept this permission..?")
            setPositiveButton(
                "Accept",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(
                        this@MainActivityFloatingActionButton,
                        "Done..!",
                        Toast.LENGTH_LONG
                    ).show()
                })
            setNegativeButton(
                "Cancel",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(
                        this@MainActivityFloatingActionButton,
                        "Canceled..!",
                        Toast.LENGTH_LONG
                    ).show()
                })
        }
        val dialog = builder.create().show()
    }
}