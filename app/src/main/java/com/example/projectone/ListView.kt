package com.example.projectone

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projectone.databinding.ActivityListViewBinding

class ListView : AppCompatActivity() {

    lateinit var binding: ActivityListViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val dogsList = ArrayList<Dogs>()
        dogsList.add(Dogs("Dog1", "Decs1", R.drawable.a))
        dogsList.add(Dogs("Dog2", "Decs1", R.drawable.b))
        dogsList.add(Dogs("Dog3", "Decs1", R.drawable.c))
        dogsList.add(Dogs("Dog4", "Decs1", R.drawable.d))
        dogsList.add(Dogs("Dog5", "Decs1", R.drawable.e))
        dogsList.add(Dogs("Dog6", "Decs1", R.drawable.f))
        dogsList.add(Dogs("Dog7", "Decs1", R.drawable.g))
        dogsList.add(Dogs("Dog8", "Decs1", R.drawable.h))
        dogsList.add(Dogs("Dog9", "Decs1", R.drawable.i))
        dogsList.add(Dogs("Dog10", "Decs1", R.drawable.j))


        val myAdapter = CustomAdapter(this, dogsList)
        binding.myList.adapter = myAdapter

        binding.myList.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, position.toString(), Toast.LENGTH_SHORT).show()
        }

    }
}