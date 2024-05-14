package com.example.projectone

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.projectone.databinding.ActivityMainImageBinding

class MainActivityImage : AppCompatActivity() {
    lateinit var binding: ActivityMainImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainImageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        loadImage()
    }

    private fun loadImage() {
        val url =
            "https://img.freepik.com/premium-photo/fresh-autumn-leaves-reveal-vibrant-organic-pattern-generated-by-artificial-intelligence_994746-1.jpg"
        Glide.with(this).load(url)
            .placeholder(R.drawable.baseline_all_inclusive_24)
            .error(R.drawable.baseline_announcement_24)
            .into(binding.photoshow)
    }
}